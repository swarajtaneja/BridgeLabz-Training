//Train Reservation Queue 🚆
//Simulate a basic ticket booking system.
//Show menu with switch
//Allow multiple bookings using while-loop.
//Stop booking once seats reach zero (break).



import java.util.Scanner;
public class TrainBookingSystem
{
         public static void main(String [] args)
         {
               Scanner sc=new Scanner(System.in);
               String task="";
               int seats=10;
               int index=0;
               String [][] data=new String [seats][2];
               System.out.print("(book / status / exit) : ");
               task = sc.next();
               while(!task.equals("exit"))
               {
                     if(seats==0)
                     {
                        System.out.println("No Seats left");
                        break;
                     }
                     switch(task)
                     {
                        case "book" :
                                    System.out.print("Enter Name : ");
                                    data[index][0]=sc.next();
                                    System.out.print("Enter Age : ");
                                    data[index][1]=sc.next();
                                    System.out.println(" Booked Successfully ");
                                    index++;
                                    seats--;
                                    break;
                        case "status" :
                                    System.out.println("Seats Left : "+ seats);
                                    break;
                     }
     

                     System.out.print("(book / status / exit) : ");
                     task = sc.next();
               }
         }
}