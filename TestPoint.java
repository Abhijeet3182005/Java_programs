package com.dkte;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept coordinates for first point
        System.out.print("Enter x and y for Point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Accept coordinates for second point
        System.out.print("Enter x and y for Point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Create point objects
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // Display details
        System.out.println("\nPoint 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        // Check if points are equal
        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same position.");
        } else {
            double distance = p1.calculateDistance(p2);
            System.out.printf("Points are different.\nDistance between them: %.2f\n", distance);
        }

        sc.close();
    }
}
