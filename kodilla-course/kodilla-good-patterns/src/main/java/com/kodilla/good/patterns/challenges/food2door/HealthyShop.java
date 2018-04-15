package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends Supplier {

    public HealthyShop() {
        this.setSupplierName("Healthy Shop");
        this.setOnShelfQuantity(20.0);
        this.setProductName("HEALTHY Bio apples");
        this.setOrderedQuantity(1.5);
    }

    @Override
    public boolean process() {
        if (getOnShelfQuantity() >= getOrderedQuantity()) {
            System.out.println("\nProcessing transaction with store " + getSupplierName() +
                    "\nYou can pay for your order only using credit card!");
        }
        return true;
    }
}

