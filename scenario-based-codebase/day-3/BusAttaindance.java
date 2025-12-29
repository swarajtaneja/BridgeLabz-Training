//School Bus Attendance System 🚍
//Track 10 students' presence.
//Use for-each loop on names.
//Ask "Present or Absent?"
//Print total present and absent counts.


import java.util.Scanner;
public class BusAttaindance
{
         public static void main(String[] args)
         {
               Scanner input =new Scanner(System.in);
               String task="";
               System.out.print("(start / exit) : ");
               task = input.next();
               while(!task.equals("exit"))
               {
                     int presentCount=0,absentCount=0;
                     System.out.println("Attaindance: (present / absent)");
                     for(int i=0;i<10;i++)
                     {
                         System.out.print("Student "+(i+1)+" Status : ");
                         String status=input.next();
                         if(status.equals("present"))
                         {
                              presentCount++;
                         }
                         else
                         {
                               absentCount++;  
                         }
                     }
                     System.out.println("Total Present : "+presentCount+" and Total Absent : "+absentCount);
                     System.out.print("(start / exit) : ");
                     task = input.next();
               }
         }
}