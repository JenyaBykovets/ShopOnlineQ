package Controller;

import Model.Order;
import View.OrderView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int quantity = scanner.nextInt();

        System.out.println("Enter the price per item: ");
        double price = scanner.nextDouble();

        System.out.println("Enter the order category (pickup/delivery): ");
        String category = scanner.next();

        Order order = new Order(quantity, price, category);
        OrderView orderView = new OrderView();
        OrderController orderController = new OrderController(order, orderView);

        orderController.displayTotalCost();

        scanner.close();
    }
}

