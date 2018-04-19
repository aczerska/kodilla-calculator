package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        Supplier supplier;
        Product product = new Product("Gluten free oats");
        System.out.println(product.getProductName());

        if(product.getProductName().equals(product.getProductsCollection().containsKey(product.getProductName()))) {
            supplier = product.getProductsCollection().get(product.getProductName());
            System.out.println(supplier.getDescription());
            System.out.println(supplier.getTransactionSummary(supplier.process()));
        }
    }
}
