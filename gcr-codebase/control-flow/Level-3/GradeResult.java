import java.util.Scanner;

public class GradeResult{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics Marks : ");
        double physics = input.nextDouble();

        System.out.print("Enter Chemistry Marks : ");
        double chemistry = input.nextDouble();

        System.out.print("Enter Maths Marks : ");
        double maths = input.nextDouble();
        
        double averageMarks=(physics+chemistry+maths)/3;

             if (averageMarks>=80){
                    System.out.println("Average Marks : "+averageMarks+" Grade A and Remarks :Level 4, above agency-normalized standards");
                                                                 } 
             else if (averageMarks>=70 && averageMarks<=79){
                    System.out.println("Average Marks : "+averageMarks+" Grade B and Remarks :Level 3, at agency-normalized standards");
                                                                 }
             else if (averageMarks>=60 && averageMarks<=69){
                    System.out.println("Average Marks : "+averageMarks+" Grade C and Remarks :Level 2, below, but approaching agency-normalized standards");
                                                                 }
             else if (averageMarks>=50 && averageMarks<=59){
                    System.out.println("Average Marks : "+averageMarks+" Grade D and Remarks :Level 1, well below agency-normalized standards");
                                                                 }
             else if (averageMarks>=40 && averageMarks<=49){
                    System.out.println("Average Marks : "+averageMarks+" Grade E and Remarks :Level 1-, too below agency-normalized standards");
                                                                 }
             else{
                    System.out.println("Average Marks : "+averageMarks+" Grade R and Remarks :Remedial standards");
                                                                 }
                           

                                        }
                         }