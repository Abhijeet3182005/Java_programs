package com.dkte;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); // Using setter for validation
        setPricePerItem(pricePerItem); // Using setter for validation
    }

    // Getters and Setters
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    // Method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
