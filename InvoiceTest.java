package com.dkte;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter part number: ");
        String partNumber = scanner.nextLine();

        System.out.print("Enter part description: ");
        String partDescription = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Creating Invoice object
        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        // Displaying results
        System.out.println("\n--- Invoice Summary ---");
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: ₹" + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: ₹" + invoice.getInvoiceAmount());

        scanner.close();
    }
}
