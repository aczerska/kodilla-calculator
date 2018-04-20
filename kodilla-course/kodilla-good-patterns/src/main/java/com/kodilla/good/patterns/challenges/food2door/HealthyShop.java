package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class HealthyShop extends Supplier {

    public HealthyShop(String supplierName, double onShelfQuantity) {
        super(supplierName, onShelfQuantity);
    }

    @Override
    public boolean process(String selectedProduct, double selectedProductQuantity, Map<String, Supplier> allProducts) {
        if (getOnShelfQuantity() >= selectedProductQuantity) {
            System.out.println("\nProcessing transaction with store " + getSupplierName() +
                    "\nYou can pay for your order only using credit card!");
            setOnShelfQuantity(getOnShelfQuantity() - selectedProductQuantity);
            return true;
        }
        return false;
    }
}

