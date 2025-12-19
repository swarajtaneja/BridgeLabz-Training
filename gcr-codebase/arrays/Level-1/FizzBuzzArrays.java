import java.util.Scanner;

public class FizzBuzzArrays{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = input.nextInt();

        int [] array =new int[number+1];

        if(number > (0)){
             for(int i =0;i<number+1;i++){
                 array[i]=i;
                    }
             int size=array.length;
             for(int index=1;index<size;index++){
                   if(array[index]%3==0 && array[index] %5==0){
                             System.out.println("Position "+ array[index] +" = FizzBuzz");     
                                          }
                   else if(array[index]%3==0) {
                             System.out.println("Position "+ array[index] +" = Fizz");
                                     }
                   else if (array[index]%5==0){
                             System.out.println("Position "+ array[index] +" = Buzz");
                                      }
                   else{
                             System.out.println("Position "+array[index]+" = "+array[index]);
                       }  
                                        }
                                         }
        else{
            System.out.println("The Number "+number+" is not a positive integer");
            }
                                          }
                              }