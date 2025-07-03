package com.dkte;

import java.util.Scanner;

public class FruitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display fruit names");
            System.out.println("5. Show fresh fruits details");
            System.out.println("6. Mark a fruit as stale");
            System.out.println("7. Show tastes of stale fruits");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1: // Add Mango
                case 2: // Add Orange
                case 3: // Add Apple
                    if (counter >= basket.length) {
                        System.out.println("Basket is full!");
                        break;
                    }
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter weight: ");
                    double weight = sc.nextDouble();
                    System.out.print("Enter color: ");
                    String color = sc.next();

                    Fruit fruit = null;
                    if (choice == 1)
                        fruit = new Mango(name, weight, color);
                    else if (choice == 2)
                        fruit = new Orange(name, weight, color);
                    else if (choice == 3)
                        fruit = new Apple(name, weight, color);

                    basket[counter++] = fruit;
                    System.out.println(fruit.getName() + " added.");
                    break;

                case 4: // Display names
                    System.out.println("Fruits in basket:");
                    for (Fruit f : basket) {
                        if (f != null)
                            System.out.println(f.getName());
                    }
                    break;

                case 5: // Show fresh fruits
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString());
                            System.out.println("Taste: " + f.taste());
                        }
                    }
                    break;

                case 6: // Mark stale
                    System.out.print("Enter index to mark as stale: ");
                    int index = sc.nextInt();
                    if (index < 0 || index >= basket.length || basket[index] == null) {
                        System.out.println("Invalid index!");
                    } else {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale.");
                    }
                    break;

                case 7: // Show stale tastes
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " taste: " + f.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
        System.out.println("Thanks for using Fruit Basket!");
    }
}
