/*
 * Inheritance Example:
 * Inharitance is a fundamental concept in object-oriented programming that allows a class to inherit properties and methods from another class like in the real world case if we seed you are in telecom industry
 * you can have a parent class called "Employee" and child classes like "Engineer", "Manager", and "Technician" that inherit common attributes and behaviors from the "Employee" class.
 * This promotes code reuse and establishes a hierarchical relationship between classes.
* In this example, we will create a base class called "Employee" and two derived classes called "Engineer" and "Manager". 
 */


package org.inhertance;
import org.inhertance.Employee;
import org.inhertance.Engineer;
import org.inhertance.Manager;
import org.inhertance.Technician;
public class App {

    public static void main(String[] args) {
        // Create an Engineer object
        Engineer engineer = new Engineer("Alice", 30, "Software Engineer", "Java");
        engineer.displayInfo();
        System.out.println();

        // Create a Manager object
        Manager manager = new Manager("Bob", 40, "Project Manager", 10);
        manager.displayInfo();
        System.out.println();

        // Demonstrating polymorphism
        Employee employee1 = new Engineer("Charlie", 28, "Data Engineer", "Python");
        Employee employee2 = new Manager("Diana", 35, "Product Manager", 5);
        employee1.displayInfo();
        System.out.println();
        employee2.displayInfo();
        System.out.println();
    }
}

