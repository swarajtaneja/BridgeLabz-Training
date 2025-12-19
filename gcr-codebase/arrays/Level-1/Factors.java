import java.util.Scanner;

public class Factors{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int index =0,counter = 0 ;

        System.out.print("Enter Positive Integer : ");
        int number = input.nextInt();

        if(number>=0){
              for(int i =1;i<number+1;i++){
                  if(number%i==0){
                      counter++;
                                  }
                                           }
              int [] factors = new int[counter];
              System.out.print("The Factors of Number "+number+" is : ");
              for (int j =1;j<number+1;j++){
                    if(number%j==0){
                         factors[index]=j;
                         index++;
                                   }
                                               }
               for(int k=0;k<(factors.length);k++){
                         System.out.print(factors[k]+"  ");
                       }
                                          
                     }
        else{
            System.out.println("Not a positive integer");
             }

                                        }
                         }