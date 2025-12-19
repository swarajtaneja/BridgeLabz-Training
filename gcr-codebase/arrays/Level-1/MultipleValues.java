import java.util.Scanner;

public class MultipleValues{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double [] elements = new double[10];
        int index = 0;
        double total=0;
        
        while(true){
              System.out.print("Enter Number : ");
              double number = input.nextDouble();
              if (number>0 && index<10){
                  elements[index]= number;
                  index++;
                                          }
              else{
                   System.out.println("Out of Range");
                   break;
                  }     
                  
                   }
        int size = elements.length;
        for(int i = 0;i<size;i++){
                total=total + elements[i];
                System.out.println(elements[i]);
                                 }
        System.out.print("Total Sum : " +total);

                                                }
                         }