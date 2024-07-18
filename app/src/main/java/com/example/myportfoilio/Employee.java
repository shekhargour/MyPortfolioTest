package com.example.myportfoilio;
public class Employee {

    private String name;
    private String position;
    private String department;
    private double salary;
    private String joinDate;

    public Employee(String name, String position, String department, double salary, String joinDate) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getJoinDate() {
        return joinDate;
    }
}
