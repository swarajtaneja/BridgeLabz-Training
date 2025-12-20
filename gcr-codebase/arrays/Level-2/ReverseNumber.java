import java.util.Scanner;

public class ReverseNumber{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count=0,index=0,size;
        
        System.out.print("Enter Number : ");
        long number =input.nextLong();
        long actual=number;
        
        while(number!=0)
        {
          number/=10;
          count++;   
        } 
        int [] digitsArray=new int[count];
        number=actual;
        while(number!=0)
        {
             int digit=(int)number%10;
             number/=10;
             digitsArray[index]=digit;
             index++;
        }
        size=digitsArray.length;
        System.out.print("Reversed Number : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(digitsArray[i]);
        }
                                         }
                                 }