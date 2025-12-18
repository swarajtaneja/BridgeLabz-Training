import java.util.Scanner;

public class SpringSeason{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Month : ");
        String month = input.nextLine();

        System.out.print("Enter Day : ");
        int day = input.nextInt();

        if((month.equals("march") && day>=20 ) || (month.equals("april") && day>=20 && day <= 31 )||(month.equals("may") && day>=20 && day <= 31 )||(month.equals("june") && day<=20 )){
            System.out.println("Its a Spring Season");
                                  }
        else{
            System.out.println("Not a Spring Season");
            }
                                          }
                              }