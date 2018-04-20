package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        String selectedProduct = "Grass fed beef";
        double selectedProductQuantity = 500;

        ProductsCollection productsCollection = new ProductsCollection();
        Map<String,Supplier> allProducts = productsCollection.getAllProductsCollection();

        if(productsCollection.getAllProductsCollection().containsKey(selectedProduct)) {
            Supplier supplier = allProducts.get(selectedProduct);
            supplier.getDescription(selectedProduct,selectedProductQuantity);
            boolean processed = supplier.process(selectedProduct, selectedProductQuantity,allProducts);
            supplier.getTransactionSummary(processed,selectedProduct,selectedProductQuantity);
        }

    }
}
