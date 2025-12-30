// Temperature Logger 🌡️
//Record temperatures over 7 days.
// Use array and for-loop.
// Find average and max temperature.
// Use if for comparisons. Maintain readable naming and modular code blocks.


import java.util.Scanner;
public class TemperatureLogger
{
         public static double[] recordTemperature(int days)
         {
               System.out.println(_______Temperature Logger _______);
               Scanner sc=new Scanner(System.in);
               double [] arr= new double[days];
               for(int i=0;i<days;i++)
               {
                    System.out.print("Day "+(i+1)+" Temperature : "); 
                    arr[i]=sc.nextDouble();
               }
               return arr;
               
         }
         public static double averageTemperature(double[] record)
         {
              double average,sum=0;
              for(int i=0;i<7;i++)
              {
                   sum+=record[i]; 
              }
              average=sum/7;
              return average;
         }
         public static double maxTemperature(double[] record)
         {
               double max=record[0];
               for(int i=1;i<7;i++)
               {
                     if(max<record[i])
                     {
                         max=record[i]; 
                     }
                     else
                     {
                         continue;
                     }
               }
               return max;
         }
         public static void main(String [] args)
         {
               Scanner sc=new Scanner(System.in);
               int days=7;
               double [] record=recordTemperature(days);
               double average=averageTemperature(record);
               double maximum=maxTemperature(record);
               System.out.println("Average Temperature of 7 days : "+average+ " and Maximum of 7 days : "+maximum);
         }
}