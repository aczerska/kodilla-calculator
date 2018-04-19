package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class Product {

    private Supplier supplier;
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(supplier, product.supplier) &&
                Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplier, productName);
    }

    public Map<Product,Supplier> getProductsCollection() {
        Map<Product,Supplier> productsMap = new HashMap<>();
        productsMap.put(new Product("Extra grass fed beef"), new ExtraFoodShop("Extra Food Shop"));
        productsMap.put(new Product("Gluten free oats"), new GlutenFreeShop("Gluten Free Shop"));
        productsMap.put(new Product("Fresh bio apples"), new HealthyShop("Healthy Shop"));
        return productsMap;
    }
}






