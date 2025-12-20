import java.util.Scanner;

public class SalaryBonus{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalOldSalary=0,totalNewSalary=0,totalBonus=0;  
       
        double [] salaryArray = new double[10];
        double [] serviceArray = new double [10];
        for(int i =0 ;i<10;i++){
                 System.out.print("Enter Salary : ");
                 double salary = input.nextDouble();

                 System.out.print("Enter Years : ");
                 double  yearsOfService = input.nextDouble();
                  if(salary<0 && yearsOfService<0){
                     System.out.println("Invalid");

                     System.out.println("Enter Salary again :");
                     salary = input.nextDouble();
                     salaryArray[i]=salary;

                     System.out.println("Enter Years Again");
                     yearsOfService = input.nextDouble();
                     serviceArray[i]=yearsOfService;
                                                 } 
                  else{
                     salaryArray[i]=salary;
                     serviceArray[i]=yearsOfService;
                                          }         
                      }

         double [] newSalaryArray= new double[10];
         for(int i=0;i<10;i++){
             if(serviceArray[i]>=5){
                  totalBonus=totalBonus+salaryArray[i]*0.05;
                  newSalaryArray[i]=salaryArray[i]+salaryArray[i]*0.05;
                                   }
             else{
                  totalBonus=totalBonus+salaryArray[i]*0.05;
                  newSalaryArray[i]=salaryArray[i]+salaryArray[i]*0.05; 
                     }
                              }

         System.out.println("Total Bonus : "+totalBonus);
         for(int i=0;i<10;i++){
                totalOldSalary=totalOldSalary+salaryArray[i];
                             }
         System.out.println("Total Old Salary : "+totalOldSalary);
         for(int i=0;i<10;i++){
               totalNewSalary= totalNewSalary+newSalaryArray[i];
                                 }
         System.out.println("Total New Salary: "+totalNewSalary);
 
                                   }
                              }