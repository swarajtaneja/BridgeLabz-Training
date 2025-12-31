//Digital Watch Simulation 
//Simulate a 24-hour watch:
//Print hours and minutes in a nested for-loop.
//Use a break to stop at 13:00 manually (simulate power cut).


public class DigitalWatch
{
         public static void main(String[] args)
         {
             for(int i=0;i<24;i++)
             {
                   for(int j=0;j<60;j++)
                   {
                        if(i==13 && j==1) break;
                        if(i<10)
                        {
                              if(j<10)
                              {
                                   System.out.println("Time : 0"+i+":"+"0"+j); 
                              }
                              else
                              {
                                   System.out.println("Time : 0"+i+":"+j);
                              }
                        }
                        else
                        {
                              if(j<10)
                              {
                                   System.out.println("Time : "+i+":"+"0"+j); 
                              }
                              else
                              {
                                   System.out.println("Time : "+i+":"+j);
                              }
                        }
                   }
                   if(i==13)break;
             } 
         }  
}