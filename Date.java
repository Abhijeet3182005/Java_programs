package com.dkte;

public class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters and Getters
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Display method
    public void displayDate() {
        System.out.printf("%d/%d/%d%n", day, month, year);
    }
}
