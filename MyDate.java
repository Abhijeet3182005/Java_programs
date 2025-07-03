package com.dkte;

public class MyDate {
    private int day ,month,year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }

    public String toString() {
        return String.format(day+"-"+month+"-"+year);
    }
}


class Person {
    private String name;
    private MyDate dateOfBirth;

    public Person(String name, MyDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() { return name; }
    public MyDate getDateOfBirth() { return dateOfBirth; }

    public void setName(String name) { this.name = name; }
    public void setDateOfBirth(MyDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String toString() {
        return "Name: " + name + ", DOB: " + dateOfBirth;
    }
}


class Employee extends Person {
    private int id;
    private String department;
    private double salary;
    private MyDate dateOfJoining;

    public Employee(String name, MyDate dob, int id, String dept, double salary, MyDate doj) {
        super(name, dob);
        this.id = id;
        this.department = dept;
        this.salary = salary;
        this.dateOfJoining = doj;
    }

    public int getId() { return id; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public MyDate getDateOfJoining() { return dateOfJoining; }

    public String toString() {
        return super.toString() +
               ", ID: " + id +
               ", Dept: " + department +
               ", Salary: ₹" + salary +
               ", DOJ: " + dateOfJoining;
    }
}




