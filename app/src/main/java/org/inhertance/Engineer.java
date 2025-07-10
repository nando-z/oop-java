package org.inhertance;

public class Engineer extends Employee {
    private String programmingLanguage;

    public Engineer(String name, int age, String position, String programmingLanguage) {
        super(name, age, position);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
