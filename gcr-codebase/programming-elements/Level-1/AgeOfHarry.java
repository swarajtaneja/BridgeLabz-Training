//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024.
//Creating Class with name AgeOfHarry.
class AgeOfHarry{

    public static void main(String[] args){

        //Creating a int variable with name birthyear and assigning the value 2000.
        int birthYear = 2000;

        //Creating a int variable with name currentYear and assigning the value 2024.
        int currentYear = 2024;

        /*
         *Creating a int variable with name harryAge and calculating the age.
         *Use of subtraction operator (-)
        */
        int  harryAge = (currentYear-birthYear);
        
        //Displaying Harry's Age text and variable.
        System.out.println("Harry's age in 2024 is " + harryAge); 
                                          }
                }