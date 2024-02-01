package Model;

import java.util.Scanner;

public class Order {
    private int quantity;
    private double price;
    private String category;

    public Order(int quantity, double price, String category) {
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public double calculateTotalCost() {
        if (category.equalsIgnoreCase("pickup")) {
            return quantity * price;
        } else if (category.equalsIgnoreCase("delivery")) {
            return calculateTotalCostWithDelivery();
        } else {
            throw new IllegalArgumentException("Invalid category entered.");
        }
    }

    private double calculateTotalCostWithDelivery() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the delivery fee as a percentage of the total cost: ");
        double deliveryFeePercentage = scanner.nextDouble();
        double deliveryFee = (deliveryFeePercentage / 100) * (quantity * price);
        return (quantity * price) + deliveryFee;
    }
}


