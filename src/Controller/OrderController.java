package Controller;

import Model.Order;
import View.OrderView;

public class OrderController {
    private Order order;
    private OrderView orderView;

    public OrderController(Order order, OrderView orderView) {
        this.order = order;
        this.orderView = orderView;
    }

    public void updateOrder(int quantity, double price, String category) {
        order = new Order(quantity, price, category);
    }

    public void displayTotalCost() {
        double totalCost = order.calculateTotalCost();
        orderView.displayTotalCost(totalCost);
    }
}


