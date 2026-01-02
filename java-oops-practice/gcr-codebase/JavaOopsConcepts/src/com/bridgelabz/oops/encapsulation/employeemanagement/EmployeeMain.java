package com.bridgelabz.oops.encapsulation.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain{

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 500, 40);

        employees.add(e1);
        employees.add(e2);

        // Polymorphism: Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("-------------------");
        }
    }
}