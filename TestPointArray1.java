package com.dke;


import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b) Accept number of points to plot
        System.out.print("Enter how many points to plot: ");
        int size = sc.nextInt();

        // c) Create array
        Point2D[] points = new Point2D[size];

        // d) Accept coordinates and store
        for (int i = 0; i < size; i++) {
            System.out.println("Enter x and y coordinates for point " + i + ":");
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point2D(x, y);
        }

        boolean exit = false;

        // e) Menu
        while (!exit) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Display distance between 2 points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Option 1: Specific point
                    System.out.print("Enter index of point: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < size) {
                        System.out.println("Point at index " + index + " is: " + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!");
                    }
                    break;

                case 2:
                    // Option 2: All points
                    System.out.println("All points:");
                    for (Point2D p : points) {
                        System.out.println(p.getDetails());
                    }
                    break;

                case 3:
                    // Option 3: Distance between two points
                    System.out.print("Enter index of first point: ");
                    int i1 = sc.nextInt();
                    System.out.print("Enter index of second point: ");
                    int i2 = sc.nextInt();

                    if (i1 >= 0 && i1 < size && i2 >= 0 && i2 < size) {
                        if (!points[i1].isEqual(points[i2])) {
                            double dist = points[i1].calculateDistance(points[i2]);
                            System.out.printf("Distance between point %d and %d: %.2f\n", i1, i2, dist);
                        } else {
                            System.out.println("Both points are at the same location.");
                        }
                    } else {
                        System.out.println("Invalid indices! Please retry.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice! Please select from 1 to 4.");
            }
        }

        sc.close();
    }
}
