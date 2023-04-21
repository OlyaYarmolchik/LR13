package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this(expirienceInYears, englishLevel, salary);
        this.name = name;
        this.surname = surname;
    }

    public Tester(int expirienceInYears, String englishLevel, double salary) {
        this(salary);
        this.englishLevel = englishLevel;
        this.expirienceInYears = expirienceInYears;

    }

    public Tester(double salary) {
        this.salary = salary;
    }

    public void print(String name, String surname){
        System.out.println("Name: " + name + "\nSurname: " + surname);
    }
    public void print(String name, String surname, String t){
        System.out.println("Name: " + name + "\nSurname: " + surname);
    }
    public void print(int expirienceInYears, String englishLevel){
        System.out.println("Experience: " + expirienceInYears + "\nEnglish level: " + englishLevel);
    }
    public void print(double salary){
        System.out.println("Salary: " + salary);
    }

    public static double doubleSalary(double salary){
        return salary * 2;
    }
}
