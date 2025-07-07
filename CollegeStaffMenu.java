package com.dkte;

import java.util.Scanner;

public class CollegeStaffMenu {
    static Scanner sc = new Scanner(System.in);
    static Staff[] staff = new Staff[10];
    static int count = 0;

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("\n1.Add Teaching\n2.Add Lab\n3.Show All Teaching\n4.Show All Lab");
            System.out.println("5.Find Teaching by ID\n6.Find Lab by ID");
            System.out.println("7.Teaching with Max Hours\n8.Lab with Min Salary\n9.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> addTeaching();
                case 2 -> addLab();
                case 3 -> showTeaching();
                case 4 -> showLab();
                case 5 -> findTeaching();
                case 6 -> findLab();
                case 7 -> maxHourTeaching();
                case 8 -> minSalaryLab();
                case 9 -> System.out.println("Exit");
                default -> System.out.println("Invalid choice");
            }
        } while (ch != 9);
    }

    static void addTeaching() {
        try {
            if (count == 10) return;
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int h = sc.nextInt();
            System.out.print("Rate: ");
            int r = sc.nextInt();
            staff[count++] = new TeachingStaff(id, name, h, r);
        } catch (StaffException e) {
            System.out.println(e.getMessage());
        }
    }

    static void addLab() {
        try {
            if (count == 10) return;
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            int s = sc.nextInt();
            staff[count++] = new LabStaff(id, name, s);
        } catch (StaffException e) {
            System.out.println(e.getMessage());
        }
    }

    static void showTeaching() {
        for (Staff s : staff)
            if (s instanceof TeachingStaff) s.display();
    }

    static void showLab() {
        for (Staff s : staff)
            if (s instanceof LabStaff) s.display();
    }

    static void findTeaching() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        for (Staff s : staff)
            if (s instanceof TeachingStaff && s.id == id) {
                s.display();
                return;
            }
        System.out.println("Not Found");
    }

    static void findLab() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        for (Staff s : staff)
            if (s instanceof LabStaff && s.id == id) {
                s.display();
                return;
            }
        System.out.println("Not Found");
    }

    static void maxHourTeaching() {
        TeachingStaff max = null;
        for (Staff s : staff)
            if (s instanceof TeachingStaff ts)
                if (max == null || ts.getHours() > max.getHours()) max = ts;
        if (max != null) max.display();
        else System.out.println("No Teaching Staff");
    }

    static void minSalaryLab() {
        LabStaff min = null;
        for (Staff s : staff)
            if (s instanceof LabStaff ls)
                if (min == null || ls.getSalary() < min.getSalary()) min = ls;
        if (min != null) min.display();
        else System.out.println("No Lab Staff");
    }
}