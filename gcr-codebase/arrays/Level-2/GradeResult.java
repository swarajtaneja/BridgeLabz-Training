import java.util.Scanner;

public class GradeResult{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number Of Person : ");
        int number = input.nextInt();
        
        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] averageMarks = new double[number];
        String[] grade=new String[number];
      
        for(int i=0;i<number;i++)
        {
              System.out.print("Enter Physics Marks : ");
              physics[i] = input.nextDouble();
              System.out.print("Enter Chemistry Marks : ");
              chemistry[i] = input.nextDouble();
              System.out.print("Enter Maths Marks : ");
              maths[i] = input.nextDouble();
              double average=(physics[i]+chemistry[i]+maths[i])/3;
              averageMarks[i] = average;

        }
        for(int i=0;i<number;i++)
        {
             if (averageMarks[i]>=80){
                    grade[i]="A";
                                                                 } 
             else if (averageMarks[i]>=70 && averageMarks[i]<=79){
                    grade[i]="B";
                                                                 }
             else if (averageMarks[i]>=60 && averageMarks[i]<=69){
                    grade[i]="C";
                                                                 }
             else if (averageMarks[i]>=50 && averageMarks[i]<=59){
                    grade[i]="D";
                                                                 }
             else if (averageMarks[i]>=40 && averageMarks[i]<=49){
                    grade[i]="E";
                                                                 }
             else{
                    grade[i]="R";
                                                                 }
        }
        for(int i =0;i<number;i++)
        {
               System.out.println("The Student Marks : "+physics[i]+", "+chemistry[i]+", "+maths[i]+" Percentage : "+averageMarks[i]+" Grades : "+grade[i]);
        }

                                         }
                                 }