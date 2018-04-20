package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class ExtraFoodShop extends Supplier {

    public ExtraFoodShop(String supplierName, double onShelfQuantity) {
        super(supplierName, onShelfQuantity);
    }

    @Override
    public boolean process(String selectedProduct, double selectedProductQuantity, Map<String, Supplier> allProducts) {
        if (getOnShelfQuantity() >= selectedProductQuantity) {
            System.out.println("\nProcessing transaction with store " + getSupplierName() +
                    "\nWe accept payment via debit card or PayPal. You will be now redirected to payment page...");
            setOnShelfQuantity(getOnShelfQuantity() - selectedProductQuantity);
            return true;
        }
        return false;
    }
}
