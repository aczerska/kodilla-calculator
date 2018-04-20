package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class GlutenFreeShop extends Supplier {

    public GlutenFreeShop(String supplierName, double onShelfQuantity) {
        super(supplierName, onShelfQuantity);
    }

    @Override
    public boolean process(String selectedProduct, double selectedProductQuantity, Map<String,Supplier> allProducts) {
        if (getOnShelfQuantity() >= selectedProductQuantity) {
            System.out.println("\nProcessing transaction with store " + getSupplierName() +
                    "\nPay us upon delivery! Special offer, no added cost!");
            setOnShelfQuantity(getOnShelfQuantity() - selectedProductQuantity);
            return true;
        }
        return false;
    }
}
