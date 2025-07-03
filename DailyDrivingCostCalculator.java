package com.dke;

import java.util.Scanner;

public class DailyDrivingCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter total miles driven per day: ");
        double totalMilesPerDay = scanner.nextDouble();

        System.out. print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double averageMilesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = scanner.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = scanner.nextDouble();


        double fuelCost = (totalMilesPerDay / averageMilesPerGallon) * costPerGallon;
        double totalCost = fuelCost + parkingFees + tolls;


        System.out.printf("Your total daily driving cost is: ₹%.2f\n", totalCost);

        scanner.close();
    }
}
