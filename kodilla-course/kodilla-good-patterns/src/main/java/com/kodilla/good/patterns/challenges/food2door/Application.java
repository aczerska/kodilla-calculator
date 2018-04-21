package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        String selectedProduct = "Grass fed beef";
        double selectedProductQuantity = 5.6;

        Map<String, Supplier> allProducts = ProductsCollection.getAllProductsCollection();

        if (allProducts.containsKey(selectedProduct)) {
            Supplier supplier = allProducts.get(selectedProduct);
            supplier.getDescription(selectedProduct, selectedProductQuantity);
            boolean processed = supplier.process(selectedProduct, selectedProductQuantity, allProducts);
            supplier.getTransactionSummary(processed, selectedProduct, selectedProductQuantity);
        }
    }
}
