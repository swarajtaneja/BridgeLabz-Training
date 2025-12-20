import java.util.Scanner;

public class GradeResult2DArray{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number Of Person : ");
        int number = input.nextInt();
        
        double[][] studentData = new double[number][3];
        double[] averageMarks = new double[number];
        String[] grade=new String[number];
      
        for(int i=0;i<number;i++)
        {
              System.out.print("Enter Physics Marks : ");
              studentData[i][0] = input.nextDouble();
              System.out.print("Enter Chemistry Marks : ");
              studentData[i][1] = input.nextDouble();
              System.out.print("Enter Maths Marks : ");
              studentData[i][2] = input.nextDouble();
              double average=(studentData[i][0]+studentData[i][1]+studentData[i][2])/3;
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
               System.out.println("The Student Marks : "+studentData[i][0]+", "+studentData[i][1]+", "+studentData[i][2]+" Percentage : "+averageMarks[i]+" Grades : "+grade[i]);
        }

                                         }
                                 }