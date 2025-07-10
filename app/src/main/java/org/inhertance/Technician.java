package org.inhertance;

public class Technician extends Employee {
    public Technician(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Technician");
    }
}
