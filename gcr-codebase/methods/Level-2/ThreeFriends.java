import java.util.Scanner;

public class ThreeFriends {
    public static String youngest(int[] age)
    {
        if (age[0]<age[1] && age[0]<age[2]){
             return "Amar";
                                           }
        else if (age[1]<age[0] && age[1]<age[2]){
             return "Akbar";
                                              }
        else{
             return "Anthony";
                                                   }  
    }
    public static String tallest(double[] height)
    {
        if (height[0]>height[1] && height[0]>height[2]){
             return "Amar";
                                           }
        else if (height[1] > height[0] && height[1] > height[2]){
             return "Akbar";
                                              }
        else{
             return "Anthony";
                        } 
    }
    
    public static void main(String [] args){
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
        ThreeFriends obj=new ThreeFriends();
        System.out.println(obj.youngest(age)+" is the Youngest");
        System.out.println(obj.tallest(height)+" is the tallest");
                                            }
                                  }