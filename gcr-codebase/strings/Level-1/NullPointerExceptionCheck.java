public class NullPointerExceptionCheck{
         public static void generateTheException(){
            String text=null;
           try
           {
                System.out.print(text.toCharArray());
           }
           catch(NullPointerException e)
           {
             System.out.println("NullPointerException Found");
           }      
                                                  }
         public static void handlingTheException(){

            String text=null;

            try{
                System.out.print(text.toCharArray());
               }

            catch(NullPointerException e)
            {
                System.out.println("Null pointer exception handled") ;
            }
                 
                                                 }
         public static void main(String[] args){

                generateTheException();

                System.out.print("Handled Exception : ");
                handlingTheException();
                                               }
                           }