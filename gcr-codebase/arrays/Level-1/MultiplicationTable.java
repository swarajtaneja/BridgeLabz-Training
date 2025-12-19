import java.util.Scanner;

public class MultiplicationTable{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int [] table = new int[10];
        int size = table.length;

        System.out.print("Enter Number : ");
        int number = input.nextInt();

        for(int i =0;i<size;i++){
           table[i]=number*(i+1);
                                 }
        for(int j=0;j<size;j++){
            System.out.println(number+ " * "+(j+1)+" = "+table[j]);
                                 }
                                                }
                         }