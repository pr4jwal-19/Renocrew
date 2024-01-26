package com.prajwal.week2.practice8;

class Employee{

    int salary;
    public int getSalary() {
        return salary;
    }

    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
public class Question1 {
    public static void main(String[] args) {
        Employee prajwal = new Employee();
        prajwal.setName("Prajwal");
        prajwal.salary = 20000;
        System.out.println("Name: "+prajwal.getName());
        System.out.println("Salary: "+prajwal.getSalary());
    }
}
