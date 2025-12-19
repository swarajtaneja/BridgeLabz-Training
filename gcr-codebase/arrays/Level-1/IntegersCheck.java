import java.util.Scanner;

public class IntegersCheck{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int [] numbers = new int[5];
        int size = numbers.length;


        for(int i =0;i<size;i++){
           System.out.print("Enter Number : ");
           int n = input.nextInt();
           numbers[i]=n;
           if(n >0){
               if(n%2==0){
                   System.out.println("Number is Positive and Even"); 
                    }   
                else{
                   System.out.println("Number is Positive and Odd"); 
                    }     
               }
           else if(n<0){
               if(n%(-2)==0){
                   System.out.println("Number is Negative and Even"); 
                    }   
                else{
                   System.out.println("Number is Negative and Odd"); 
                    }               
               }
           else{
               System.out.println("Zero");
               }
                                 }


         if(numbers[0]>numbers[4]){
               System.out.println("First Element "+numbers[0]+" is greater than second element "+numbers[4]);
             }
         else if (numbers[0]<numbers[4]){
               System.out.println("First Element "+numbers[0]+" is lesser than second element "+numbers[4]);
             }
         else{
               System.out.println("First Element "+numbers[0]+" is equal to second element "+numbers[4]);
             }

                                        }
                         }