package com.dkte;


import java.util.Scanner;

class Staff {
    int id;
    String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class TeachingStaff extends Staff {
    int hours, rate;

    TeachingStaff(int id, String name, int hours, int rate) throws StaffException {
        super(id, name);
        if (hours <= 0 || rate <= 0) throw new StaffException("Invalid Teaching Staff Details!");
        this.hours = hours;
        this.rate = rate;
    }

    int getHours() {
        return hours;
    }

    void display() {
        super.display();
        System.out.println("Hours: " + hours + ", Charges/Hour: " + rate);
    }
}

class LabStaff extends Staff {
    int salary;

    LabStaff(int id, String name, int salary) throws StaffException {
        super(id, name);
        if (salary <= 0) throw new StaffException("Invalid Lab Staff Salary!");
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

class StaffException extends Exception {
    StaffException(String msg) {
        super(msg);
    }
}