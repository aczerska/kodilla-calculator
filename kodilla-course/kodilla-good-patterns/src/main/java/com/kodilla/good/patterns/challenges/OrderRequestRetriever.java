package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("zosiasamosia", "Zofia", "Nowak");
        LocalDateTime orderDate = LocalDateTime.of(2018,4, 5, 12, 22);
        double unitPrice = 90.99;
        int orderNumber = 123456;
        int quantity = 2;

        return new OrderRequest(user,orderDate,unitPrice,orderNumber,quantity);
    }
}
