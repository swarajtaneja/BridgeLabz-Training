import java.util.Scanner;
public class FactorsMethod{
         public static int [] factors(int number){
              int index =0,counter = 0 ;

              for(int i =1;i<number+1;i++){
                  if(number%i==0){
                      counter++;
                                  }
                                           }
              int [] factorsArray = new int[counter];
              for (int j =1;j<number+1;j++){
                    if(number%j==0){
                         factorsArray[index]=j;
                         index++;
                                   }
                                           }
               return factorsArray;

                                                 }
 
         public static int sumOfFactors(int number){
                 int sum = 0;
                 for(int i =1;i<number+1;i++){
                  if(number%i==0){
                      sum+=i;
                                  }
                                          }
                  return sum;

                                                   }
         public static int productOfFactors(int number){
                 int product = 1 ;
                 for(int i =1;i<=number;i++)
                 {   
                     if(number % i==0)  {
                         product*=i;
                                       }              
                 }
                 return product;
                                                       }

         public static int squareOfFactors(int number){
              
                 int sum = 0;
                 for(int i =1;i<number+1;i++){
                      if(number % i==0)
                      {    
                          sum+=i*i;
                      }
                                          }
                  return sum;                  

                                                 }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Number : ");
                int number = input.nextInt();
              
                FactorsMethod obj = new FactorsMethod();
                
                int [] factorsArray=new int[number];
                System.out.print("The Factors of Number "+number+" is : ");
                factorsArray=obj.factors(number);
                int size =factorsArray.length;
                for(int i=0;i<size;i++){
                         System.out.print(factorsArray[i]+"  ");
                       }
                System.out.println();
                System.out.println("The Sum Of Factors is "+ obj.sumOfFactors(number)) ;  
                System.out.println("The product of factors of number "+ number +" is "+ obj.productOfFactors(number) );
                System.out.println("The Sum Of Square of Factors is "+ obj.squareOfFactors(number) );  

                
                                               }
                           }