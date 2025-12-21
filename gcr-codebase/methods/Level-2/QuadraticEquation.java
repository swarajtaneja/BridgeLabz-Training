import java.util.Scanner;
public class QuadraticEquation {
    public static double [] quadraticRoots(double a,double b ,double c)
    { 
      double delta =(Math.pow(b,2)-4*a*c);
      
      if(delta>0)
      {
           double [] array= new double[2];
           array[0]=(-b+Math.sqrt(delta)/(2*a));
           array[1]=(-b-Math.sqrt(delta)/(2*a));
           return array;
      }

      else if(delta==0) 
      {
           double [] array= new double[1];
           array[0]=-b/(2*a); 
           return array;
      }
      else{
           double [] array= new double[1];
           return array;}
    }
    

    public static void main(String args[]) {
        Scanner input =new Scanner(System.in);
	
        double a,b,c;
        System.out.print("Enter a :");
        a=input.nextDouble();
        System.out.print("Enter b :");
        b=input.nextDouble();        
        System.out.print("Enter c :");
        c=input.nextDouble();
        
        double [] array=quadraticRoots(a,b,c);
        
        int size =array.length;
        System.out.print("The Roots of Quadratic equation :"); 
        
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }        
	                                            }
                                 }