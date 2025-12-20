import java.util.Scanner;

public class ThreeFriends{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int [] age = new int [3];
        double [] height =new double[3];
     
        System.out.print("Enter Age : ");
        for(int i=0;i<3;i++){
            age[i]= input.nextInt();
                               }
        
        System.out.print("Enter Heights : ");
        for(int i =0 ;i<3;i++){
             height[i]= input.nextDouble();  
                               }

        if (age[0]<age[1] && age[0]<age[2]){
             System.out.println("Amar Is the Youngest");
                                           }
        else if (age[1]<age[0] && age[1]<age[2]){
             System.out.println("Akbar Is the Youngest");
                                              }
        else{
             System.out.println("Anthony Is the Youngest");
                                                   }
        
        if (height[0]>height[1] && height[0]>height[2]){
             System.out.println("Amar Is the Tallest");
                                           }
        else if (height[1] > height[0] && height[1] > height[2]){
             System.out.println("Akbar Is the Tallest");
                                              }
        else{
             System.out.println("Anthony Is the Tallest");
                        }
                                               }
                              }