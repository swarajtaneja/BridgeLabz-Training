//Movie Ticket Booking App 🎬
//Ask users for movie type, seat type (gold/silver), and snacks.
//Use switch and if together.
//Loop through multiple customers.
//Clean structure and helpful variable names.


import java.util.Scanner;
public class MovieTicketBooking
{
         public static void main(String [] args)
         {
               Scanner sc=new Scanner(System.in);
               String task="",snacks,seatType;
               int index1=0,index2=0,index3=0,index4=0;
               String [][] hollywoodGoldSeats= new String[10][4];
               String [][] hollywoodSilverSeats= new String[10][4];
               String [][] bollywoodGoldSeats= new String[10][4];
               String [][] bollywoodSilverSeats= new String[10][4];
               System.out.print("(book / exit) : ");
               task = sc.next();
               while(!task.equals("exit"))
               {
                            System.out.print("Enter Movie Type (hollywood / bollywood) : ");
                            String movieType=sc.next();
                            switch(movieType)
                            {
                                case "hollywood" :
                                             System.out.print("Choose Seat Type (gold / silver) : ");
                                             seatType=sc.next();
                                             if(seatType.equals("gold"))
                                             {
                                                  
                                                      hollywoodGoldSeats[index1][0]="hollywood";
                                                      hollywoodGoldSeats[index1][1]=seatType;
                                                      System.out.print("Enter Snacks (popcorn / colddrink / chips) : ");   
                                                      snacks=sc.next();
                                                      hollywoodGoldSeats[index1][2]=snacks;
                                                      hollywoodGoldSeats[index1][3]=String.valueOf(index1+1);
                                                      System.out.println("Booked Successfully");
                                                      index1++;
                                                  
                                                  
                                             }
                                             else
                                             {
                                                  
                                                      hollywoodSilverSeats[index2][0]="hollywood";
                                                      hollywoodSilverSeats[index2][1]=seatType;
                                                      System.out.print("Enter Snacks (popcorn / colddrink / chips) : ");   
                                                      snacks=sc.next();
                                                      hollywoodSilverSeats[index2][2]=snacks;
                                                      hollywoodSilverSeats[index2][3]=String.valueOf(index2+1);
                                                      System.out.println("Booked Successfully");
                                                      index2++;
                                                  
                                                
                                             }
                                             break;
                                case "bollywood" :
                                             System.out.print("Choose Seat Type (gold / silver) : ");
                                             seatType=sc.next();
                                             if(seatType.equals("gold"))
                                             {
                                                  
                                                      bollywoodGoldSeats[index3][0]="bollywood";
                                                      bollywoodGoldSeats[index3][1]=seatType;
                                                      System.out.print("Enter Snacks (popcorn / colddrink / chips) : ");   
                                                      snacks=sc.next();
                                                      bollywoodGoldSeats[index3][2]=snacks;
                                                      bollywoodGoldSeats[index3][3]=String.valueOf(index3+1);
                                                      System.out.println("Booked Successfully");
                                                      index3++;
                                                  
                                                  
                                             }
                                             else
                                             {
                                                  
                                                      bollywoodSilverSeats[index4][0]="bollywood";
                                                      bollywoodSilverSeats[index4][1]=seatType;
                                                      System.out.print("Enter Snacks (popcorn / colddrink / chips) : ");   
                                                      snacks=sc.next();
                                                      bollywoodSilverSeats[index4][2]=snacks;
                                                      bollywoodSilverSeats[index4][3]=String.valueOf(index4+1);
                                                      System.out.println("Booked Successfully");
                                                      index4++;
                                                  
                                                  
                                             }
                                             break;
                            }
              

                     System.out.print("(book / exit) : ");
                     task = sc.next();
               }
         }
}