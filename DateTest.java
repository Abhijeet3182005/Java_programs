package com.dkte;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Create Date object using user input
        Date date = new Date(day, month, year);

        // Display the entered date
        System.out.print("The date is: ");
        date.displayDate();

        // Modify the date
        System.out.println("\nNow enter new values to modify the date:");

        System.out.print("Enter new day: ");
        date.setDay(scanner.nextInt());

        System.out.print("Enter new month: ");
        date.setMonth(scanner.nextInt());

        System.out.print("Enter new year: ");
        date.setYear(scanner.nextInt());

        // Display the modified date
        System.out.print("The modified date is: ");
        date.displayDate();

        scanner.close();
    }
}
