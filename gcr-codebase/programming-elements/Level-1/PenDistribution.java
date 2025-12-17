/*
 * Write a program to find how many pens each student will get if the pens must be divided equally.
 * Also, find the remaining non-distributed pens.
 *Creating a public Class with name PenDistribution.
 */
public class PenDistribution{

    public static void main(String[] args){

        /*
         *Creating multiline variables with name totalPens and numberOfStudents.
         *Assigning the values 14 and 3.
         */
        int totalPens = 14 , numberOfStudents = 3;

        //Creating a int variable with name distributedPens.
        int distributedPens = totalPens / numberOfStudents;

        //Creating a int variable with name nonDistributedPens.
        int nonDistributedPens = totalPens % numberOfStudents;
        
        //Displaying the result.
        System.out.println("The Pen Per Student is " + distributedPens + " and the remaining pen not distributed is " + nonDistributedPens); 
                                          }
                }