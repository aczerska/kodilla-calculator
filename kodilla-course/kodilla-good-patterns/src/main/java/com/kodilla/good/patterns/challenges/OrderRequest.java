package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderDate;
    private double unitPrice;
    private int orderNumber;
    private int quantity;

    public OrderRequest(final User user, final LocalDateTime orderDate, final double unitPrice, final int orderNumber, final int quantity) {
        this.user = user;
        this.orderDate = orderDate;
        this.unitPrice = unitPrice;
        this.orderNumber = orderNumber;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculatePrice() {
        return getQuantity() * getUnitPrice();
    }
}
