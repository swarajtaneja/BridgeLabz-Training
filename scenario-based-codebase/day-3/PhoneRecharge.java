//Phone Recharge Simulator 📱
//Take the user's mobile operator and amount.
//Use a switch to display offers.
//Loop to allow repeated recharges.
//Show balance after each recharge.



import java.util.Scanner;
public class PhoneRecharge
{
         public static void main(String[] args)
         {
               Scanner input =new Scanner(System.in);
               String task="";
               int balance=4000;
               System.out.print("(start / exit) : ");
               task = input.next();
               while(!task.equals("exit"))
               {
                     System.out.print("Enter Operator (jio/airtel/bsnl) :");
                     String operator=input.next();
                     switch(operator)
                     {
                          case "jio":
                                System.out.println("JIO");
                                System.out.println("1. 200rs: voice(unlimited) validity(28 days) data(10gb)");
                                System.out.println("2. 450rs: voice(unlimited) validity(56 days) data(1.5gb/day)");
                                System.out.println("3. 800rs: voice(unlimited) validity(84 days) data(2gb/day)");
                                break;
                          case "airtel":
                                System.out.println("AIRTEL");
                                System.out.println("1. 200rs: voice(unlimited) validity(28 days) data(10gb)");
                                System.out.println("2. 450rs: voice(unlimited) validity(56 days) data(1.5gb/day)");
                                System.out.println("3. 800rs: voice(unlimited) validity(84 days) data(2gb/day)");
                                break;
                          case "bsnl":
                                System.out.println("BSNL");
                                System.out.println("1. 200rs: voice(unlimited) validity(28 days) data(10gb)");
                                System.out.println("2. 450rs: voice(unlimited) validity(56 days) data(1.5gb/day)");
                                System.out.println("3. 800rs: voice(unlimited) validity(84 days) data(2gb/day)");
                                break;
                          default:
                                System.out.println("Not an operator");
                               
                     }
                     System.out.print("Enter Phone Number : +91 ");
                     String number =input.next();
                     String operatorName=operator;
                     System.out.print("Enter Amount : ");
                     int amount =input.nextInt();
                     if(amount==200)
                     {
                        System.out.println("Operator :"+operatorName+" Number : +91 "+number+" Plan:  200rs: voice(unlimited) validity(28 days) data(10gb) Recharged Successfully");  
                        balance-=amount;
                        System.out.println("Balance : "+balance);  
                     }
                     else if(amount==450)
                     {
                        System.out.println("Operator :"+operatorName+" Number : +91 "+number+" Plan:  450rs: voice(unlimited) validity(56 days) data(1.5gb/day) Recharged Successfully"); 
                        balance-=amount; 
                        System.out.println("Balance : "+balance);  
                     }
                     else
                     {
                        System.out.println("Operator :"+operatorName+" Number : +91 "+number+" Plan:  800rs: voice(unlimited) validity(84 days) data(2gb/day) Recharged Successfully");  
                        balance-=amount;
                        System.out.println("Balance : "+balance);  
                     }
                     System.out.print("(repeat / exit) : ");
                     task = input.next();
               }
         }
}