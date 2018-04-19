package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends Supplier {

    public HealthyShop(String supplierName) {
        super(supplierName);
    }

    @Override
    public boolean process() {
        if (getOnShelfQuantity() >= getOrderedQuantity()) {
            System.out.println("\nProcessing transaction with store " + getSupplierName() +
                    "\nYou can pay for your order only using credit card!");
            return true;
        }
        return false;
    }
}

