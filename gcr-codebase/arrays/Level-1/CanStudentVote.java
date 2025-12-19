import java.util.Scanner;

public class CanStudentVote{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int [] studentAge = new int[10];
        int size = studentAge.length;


        for(int i =0;i<size;i++){
            System.out.print("Enter Age : ");
            int age = input.nextInt();

            while(age<0){
                System.out.println("Invalid Age"); 
                System.out.print("Enter Again : ");
                age =input.nextInt();   
                      }
            studentAge[i] = age;
            if(studentAge[i]>18){
                System.out.println("The Person with age "+age+" can vote");
                                }
            else{
                System.out.println("The Person with age "+age+" cannot vote");
                }
                               }
                                        }
                         }