import java.util.Scanner;
public class ParkingLot
{
         public static void main(String[] args)
         {
               Scanner input =new Scanner(System.in);
               int occupancy=0;
               System.out.print("( park / occupancy / exit) :");
               String task =input.next();
               while(!task.equals("exit"))
               {
                     if(occupancy==5)System.out.println("Parking Lot is Full");
                     else
                     { 
                         if(task.equals("park"))
                         {
                               System.out.println("Vehicle Parked");
                               occupancy++;

                         }
                         if(task.equals("occupancy"))
                         {
                               System.out.println("Occupancy :"+occupancy);
                         }
                     } 
               System.out.print("( park / occupancy / exit) :");
               task =input.next();
               }
         }
}