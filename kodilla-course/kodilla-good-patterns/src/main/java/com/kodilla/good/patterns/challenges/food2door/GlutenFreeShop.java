package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends Supplier {

    public GlutenFreeShop() {
        this.setSupplierName("Gluten Free Shop");
        this.setOnShelfQuantity(5000);
        this.setProductName("GF oates");
        this.setOrderedQuantity(500.0);
    }

    @Override
    public boolean process() {
        if (getOnShelfQuantity() >= getOrderedQuantity()) {
            System.out.println("\nProcessing transaction with store " + getSupplierName() +
                    "\nPay us upon delivery! Special offer, no added cost!");
        }
        return true;
    }
}
