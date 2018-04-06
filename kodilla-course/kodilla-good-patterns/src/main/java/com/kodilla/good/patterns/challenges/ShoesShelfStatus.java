package com.kodilla.good.patterns.challenges;

public class ShoesShelfStatus implements ShelfMonitoringService {

    private static int initialQuantity = 100;

    @Override
    public void updateQuantity(OrderRequest orderRequest) {
        int currentQuantity = initialQuantity - orderRequest.getQuantity();
        System.out.println("\nQuantity of items left on the shelf: " + currentQuantity);
    }
}
