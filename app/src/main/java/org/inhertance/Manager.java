package org.inhertance;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, String position, int teamSize) {
        super(name, age, position);
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
