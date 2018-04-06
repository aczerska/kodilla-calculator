package com.kodilla.good.patterns.challenges;

public class ShoesShelfStatus implements ShelfMonitoringService {

    private static int initialQuantity = 100;

    @Override
    public int updateQuantity(OrderRequest orderRequest) {
        return initialQuantity - orderRequest.getQuantity();
    }
}
