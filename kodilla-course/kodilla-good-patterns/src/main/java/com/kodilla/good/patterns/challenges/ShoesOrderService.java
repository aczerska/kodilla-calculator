package com.kodilla.good.patterns.challenges;

public class ShoesOrderService implements ProductOrderService {

    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("Shoes were ordered by: " + orderRequest.getUser() + "\nTotal price: " + orderRequest.calculatePrice());
        return true;
    }
}
