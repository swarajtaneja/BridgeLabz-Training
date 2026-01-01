package com.bridgelabz.oops.inheritance.animal;

public class Animal {
             private String name;
             private int age;
             public Animal(String name,int age){
            	 this.name=name;
            	 this.age=age;
             }
             public void makesound() {
            	 System.out.println("Animal is making sound");
             }
}
