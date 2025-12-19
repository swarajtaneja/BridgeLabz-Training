import java.util.Scanner;

public class OddEven{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int indexEven=0,indexOdd=0;

        System.out.print("Enter Number : ");
        int number = input.nextInt();
        int size = number/2+1;
        if (number < 0) {
            System.err.println("Not a natural number");
            System.exit(0);
        }

       
        int [] even = new int[size];
        System.out.print("Even Numbers : ");

        for(int i= 1;i<=number;i++){
             if(i%2==0){
                 even[indexEven]=i;
                 System.out.print(i+" ");
                 indexEven++;
                 }
              }
        System.out.println();
        int [] odd = new int[size];
        System.out.print("Odd Numbers : ");

        for(int j= 1;j<=number;j++){
             if(j%2!=0){
                 even[indexOdd]=j;
                 System.out.print(j+" ");
                 indexOdd++;
                 }
              }
                                        }
                         }