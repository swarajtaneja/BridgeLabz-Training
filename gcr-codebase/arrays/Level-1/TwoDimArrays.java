import java.util.Scanner;

public class TwoDimArrays{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int index=0;  
           
        System.out.print("Enter Rows : ");
        int rows = input.nextInt();

        System.out.print("Enter Columns : ");
        int  columns = input.nextInt();
       
        double [] elements = new double[rows*columns];

        double [] [] twoArray =new double[rows][columns];
      
        System.out.print("Enter Array Elements : ");
        for (int i =0;i<rows;i++){
              for (int j =0 ;j<columns;j++){
                       twoArray[i][j] = input.nextDouble();
                       elements[index]=twoArray[i][j];
                       index++;
                         }
                             }
        int size=elements.length;
        System.out.print("Array Elements Are : ");
        for (int i=0;i<size;i++){
                   System.out.print(" "+elements[i]+", ");              
                                }
                                   }
                              }