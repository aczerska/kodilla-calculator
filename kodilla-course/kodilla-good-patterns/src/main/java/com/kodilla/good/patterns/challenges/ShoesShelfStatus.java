package com.kodilla.good.patterns.challenges;

public class ShoesShelfStatus implements ShelfMonitoringService {

    private static int initialQuantity = 100;
    private int updatedQuantity;

    @Override
    public double updateQuantity(OrderRequest orderRequest) {
        updatedQuantity = initialQuantity - orderRequest.getQuantity();
        System.out.println("\nQuantity of items left on the shelf: " + updatedQuantity);
        return updatedQuantity;
    }
}
