import java.util.Scanner;

public class FootballTeam{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double [] elements = new double[11];
        int index = 0;
        double total=0;
        
        while(index<11){
              System.out.print("Enter Height : ");
              double height = input.nextDouble();
              if (height>0){
                  elements[index]= height;
                  index++;
                                          }
              else{
                   System.out.print("Invalid Height Enter Again :");
                   elements[index]= height;
                   index++;
                  }     
                  
                   }
        int size = elements.length;
        for(int i = 0;i<size;i++){
                total=total + elements[i];
                                 }
        System.out.print("Mean Height of players : " +(total)/11);

                                                }
                         }