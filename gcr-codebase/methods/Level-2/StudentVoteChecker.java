import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean ageCheck(int age)
    {
        if(age>=18) 
           {
             return true;
            }
        else
           {
           return false;
           }  
    }
    
    public static void main(String [] args){
  	Scanner input = new Scanner(System.in);
        
        int [] array=new int[10];
        StudentVoteChecker obj = new StudentVoteChecker();
        
        for (int i =0 ;i<10;i++)
        {
              System.out.print("Enter Student " + (i+1) + " age : "); 
              array[i]=input.nextInt();
              if(obj.ageCheck(array[i]))
		System.out.println("Student " + (i+1) + " can vote");
	      else
              {	
		  System.out.println("Student " + (i+1) + " cannot vote");  
              }
        }
                                            }
                                  }