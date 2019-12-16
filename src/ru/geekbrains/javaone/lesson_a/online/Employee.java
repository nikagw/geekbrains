package ru.geekbrains.javaone.lesson_a.online;

public class Employee {
    private String name;
    private String position;
    private int phoneNumber;
    private int salary;
    private int age;
    private int id;
    private static int count = 1;

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    public void increaseSalaryAfter45() {
        if (age > 45) salary += 5000;
    }

    public Employee(String name, String position, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        id = count++;
        increaseSalaryAfter45();
    }
}
