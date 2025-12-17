/*
 *Write a program to Find the average percent mark in PCM of Sam.
 *Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100.
 *Creating a public Class with name AverageMarksOfSam.
 */
public class AverageMarksOfSam{

    public static void main(String[] args){

        /*
         *Creating multiline variables with name maths, physics and chemistry.
         *Assiging the values 94, 95 and 96.
         */
        int maths = 94, physics = 95, chemistry = 96;

        /*
         *Creating a int variable with name averageMarks.
         *First adding all the subject marks.
         *Then Divide the sum by 3. 
         */
        int  averageMarks = (maths + physics + chemistry);
        
        //Displaying Sam's Average marks text and variable.
        System.out.println("Sam average marks in PCM is " + averageMarks); 
                                          }
                }