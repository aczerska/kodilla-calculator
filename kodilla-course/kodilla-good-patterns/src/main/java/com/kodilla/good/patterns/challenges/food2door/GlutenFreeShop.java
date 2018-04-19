package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends Supplier {

   public GlutenFreeShop(String supplierName) {
        super(supplierName);
    }

    @Override
    public boolean process() {
        if (getOnShelfQuantity() >= getOrderedQuantity()) {
            System.out.println("\nProcessing transaction with store " + getSupplierName() +
                    "\nPay us upon delivery! Special offer, no added cost!");
            return true;
        }
        return false;
    }
}
