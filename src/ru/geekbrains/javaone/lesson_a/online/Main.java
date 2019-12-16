package ru.geekbrains.javaone.lesson_a.online;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Java-developer", 10000, 10000, 46);

        System.out.println(employee.getName());
        System.out.println(employee.getPosition());
        System.out.println(employee.getId());

        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Neo", "PHP-developer", 10001,8000,43);
        employeeArr[1] = new Employee("David", "SEO optimization", 10002,6000,30);
        employeeArr[2] = new Employee("Sarah", "SMM manager", 10003,5000,25);
        employeeArr[3] = new Employee("Peter", "QA-tester", 10004,8000,35);
        employeeArr[4] = new Employee("Adam", "CEO", 10005,10000,50);

        for (Employee i : employeeArr) {
            if (i.getAge() > 40) {
                System.out.print("Name:" + i.getName() + " Position:" + i.getPosition() +
                        " Phone:" + i.getPhoneNumber() + " Salary:" + i.getSalary() +
                        " Age:" + i.getAge() + " ID:" + i.getId());
                System.out.println();
            }
        }
    }
}
