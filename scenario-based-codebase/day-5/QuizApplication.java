//Online Quiz Application
//Ask 5 questions (MCQs) from a user.
//Use arrays and for-loop.
//Record score.
//Switch for answer checking. Apply clear indentation and structured layout.


import java.util.Scanner;
public class QuizApplication
{
         public static String[] questionArray()
         {
               String[] arr1= new String[5];
               arr1[0]="1. Which of the following is not a primitive data type in Java ?";
               arr1[1]="2. When an array is passed to a method, what does the method receive ?";
               arr1[2]="3. Which keyword is used to prevent a variable's value from being modified once it has been assigned ?";
               arr1[3]="4. In Java, where are local variables and method parameters stored when a method is invoked ?";
               arr1[4]="5. Number of primitive data types in Java are ?";
               return arr1;
         }
         public static String[][] optionsAndAnswers()
         {
               String [][] arr =new String [5][5];
               arr[0][0]="A) int";arr[0][1]="B) boolean";arr[0][2]="C) String";arr[0][3]="D) double";arr[0][4]="C";
               arr[1][0]="A) A copy of the array";arr[1][1]="B) The length of the array";arr[1][2]="C) The reference of the array";arr[1][3]="D) A copy of the first element";arr[1][4]="C";
               arr[2][0]="A) static";arr[2][1]="B) abstract";arr[2][2]="C) final";arr[2][3]="D) volatile";arr[2][4]="C";
               arr[3][0]="A) Heap memory";arr[3][1]="B) Array";arr[3][2]="C) Stack memory";arr[3][3]="D) Tree";arr[3][4]="C";
               arr[4][0]="A. 6";arr[4][1]="B. 7";arr[4][2]="C. 8";arr[4][3]="D. 9";arr[4][4]="C";
               return arr;
         }
         public static void main(String[] args)
         {
              Scanner sc = new Scanner(System.in);
              String [] questions=questionArray();
              String [][] optionAnswer=optionsAndAnswers();
              int score=0;
              System.out.println("__________________________________________QUiIZ APPLICATION___________________________________________");
              for(int i=0;i<questions.length;i++)
              {
                  int index=0;
                  System.out.println(questions[i]);
                  System.out.println(optionAnswer[i][index]);
                  System.out.println(optionAnswer[i][index+1]);
                  System.out.println(optionAnswer[i][index+2]);
                  System.out.println(optionAnswer[i][index+3]); 
                  System.out.print("Enter Your Option : ");
                  String option=sc.next();
                  if(option.equals(optionAnswer[i][index+4])) score++;
              }
              System.out.println("You scored : "+score+" out of 5");
         }  
}
