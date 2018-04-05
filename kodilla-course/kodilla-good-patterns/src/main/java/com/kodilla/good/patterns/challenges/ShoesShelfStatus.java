package com.kodilla.good.patterns.challenges;

public class ShoesShelfStatus implements ShelfMonitoringService {

    @Override
    public int updateQuantity(OrderRequest orderRequest) {
        int initialQuantity = 100;
        return initialQuantity - orderRequest.getQuantity();
    }
}
