import java.util.Scanner;
public class SpringSeason{
         public static boolean season(String month,int day){
                  if((month.equals("march")&& day >= 20 && day<=31)||(month.equals("april") && day >0 && day <=30)||(month.equals("may") && day > 0 && day <=31)||(month.equals("june") && day >0 && day < 20)){
                      return true;
                                }
                  else {
                      return false;
                                      }  

                                            }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);


                System.out.print("Enter Month : ");
                String month = input.next();
                System.out.print("Enter Day : ");
                int day = input.nextInt();
              
                SpringSeason obj = new SpringSeason();
                boolean result = obj.season(month,day);
                     
                if(result)
                {
                    System.out.println("It's a Spring Season");
                }
                else
                {
                     System.out.println("Not a Spring Season");
                } 
                                               }
                           }