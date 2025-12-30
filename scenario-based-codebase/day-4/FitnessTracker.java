//Sandeep’s Fitness Challenge Tracker 🏋️
//Each day Sandeep completes a number of push-ups.
//Store counts for a week.
//Use for-each to calculate total and average.
//Use continue to skip rest days.


import java.util.Scanner;
public class FitnessTracker
{
         public static int[] recordPushups(int days)
         {
               System.out.println("_______Fitness Tracker _______");
               Scanner sc=new Scanner(System.in);
               int [] arr= new int[days];
               for(int i=0;i<days;i++)
               {
                    System.out.print("Enter Day "+(i+1)+" Pushups (0 for rest day) : "); 
                    arr[i]=sc.nextInt();
               }
               return arr;
               
         }
         public static double averagePushups(int [] record)
         {
              double average,sum=0;
              for(int i=0;i<7;i++)
              {
                   if(record[i]==0)continue;
                   sum+=record[i]; 
              }
              average=sum/7;
              return average;
         }
         public static int totalPushups(int [] record)
         {
               int sum=0;
               for(int i=0;i<7;i++)
               {
                    sum+=record[i];
               }
               return sum;
         }
         public static void main(String [] args)
         {
               Scanner sc=new Scanner(System.in);
               int days=7;
               int [] record=recordPushups(days);
               double average=averagePushups(record);
               int total=totalPushups(record);
               System.out.println("__________Sandeep's Fitness Tracker_________");
               System.out.println("Total Pushups in a week :"+total);
               System.out.println("Average Pushups in a week : "+average);
               System.out.println("____________________________________________");
         }
}