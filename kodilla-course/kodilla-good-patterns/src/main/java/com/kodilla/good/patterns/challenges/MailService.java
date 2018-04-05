package com.kodilla.good.patterns.challenges;

public class MailService implements OrderConfirmationService {

    @Override
    public void confirmation(OrderRequest orderRequest) {
        System.out.println("\nSending email wih order confirmation: " +
                "\nOrder number: " + orderRequest.getOrderNumber() +
                "\nPrice: " + orderRequest.calculatePrice() +
                "\nDate of Order: " + orderRequest.getOrderDate());
    }
}
