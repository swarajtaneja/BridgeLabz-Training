import java.util.Scanner;

public class LeapYearUsingSingle{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i=1;

        System.out.print("Enter Year : ");
        int year = input.nextInt();

        if(year>=1582){
             if ((year % 4==0 && year%100!=0) || (year % 400==0)){
                    System.out.println("The year "+year+" is a leap year");
                                       } 
             else{System.out.println("The year "+year+" is not a leap year");}
                                   }                
        else{
            System.out.println("Outside Gregorian calendar");
             }

                                        }
                         }