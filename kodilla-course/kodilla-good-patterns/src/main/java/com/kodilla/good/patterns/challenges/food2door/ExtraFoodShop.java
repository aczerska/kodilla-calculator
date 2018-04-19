package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends Supplier {

    public ExtraFoodShop(String supplierName) {
        super(supplierName);
    }

    @Override
    public boolean process() {
        if (getOnShelfQuantity() >= getOrderedQuantity()) {
            System.out.println("\nProcessing transaction with store " + getSupplierName() +
                    "\nWe accept payment via debit card or PayPal. You will be now redirected to payment page...");
            return true;
        }
        return false;
    }
}
