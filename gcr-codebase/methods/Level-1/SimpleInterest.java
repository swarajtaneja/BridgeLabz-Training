import java.util.Scanner;
public class SimpleInterest{
         public static int interest(int principal,int rate,int time){
                  int simInterest=(principal*rate*time)/100;
                  return simInterest;

                                                                     }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                int principal, rate, time;

	        System.out.print("Enter Principal : ");
	        principal = input.nextInt();

	        System.out.print("Enter Rate : ");
	        rate = input.nextInt();

	        System.out.print("Enter Time : ");
	        time = input.nextInt();
              
                SimpleInterest result = new SimpleInterest();
                System.out.println("The Simple Interest is "+result.interest(principal,rate,time)+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);

                                               }
                           }