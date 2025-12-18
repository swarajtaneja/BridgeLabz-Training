import java.util.Scanner;

public class BonusOfEmployee{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double bonus = 0.05;

        System.out.print("Enter Salary : ");
        double salary = input.nextDouble();

        System.out.print("Enter Years Of Service : ");
        double years = input.nextDouble();
         
        if(salary > (-1) && years > -1){
            if(years > 5){
                     double bonusAmount = bonus * salary;
                     System.out.println("The Eligible Employee bonus amount is "+ bonusAmount);
                          }
            else{
                    System.out.println("The Employee is not Eligible For Bonus");
                    }
                                        }
        else{
            System.out.println("Wrong Data");
            }
                                          }
                              }