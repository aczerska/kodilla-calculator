package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {

        Supplier supplier1 = new ExtraFoodShop();
        Supplier supplier2 = new HealthyShop();
        Supplier supplier3 = new GlutenFreeShop();

        System.out.println(supplier1.getDescription());
        System.out.println(supplier1.getTransactionSummary(supplier1.process()));

        System.out.println(supplier2.getDescription());
        System.out.println(supplier2.getTransactionSummary(supplier2.process()));

        System.out.println(supplier3.getDescription());
        System.out.println(supplier3.getTransactionSummary(supplier3.process()));
    }
}
