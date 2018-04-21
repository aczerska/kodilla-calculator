package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ProductsCollection {
    private final static String APPLES = "Fresh bio apples";
    private final static String BEEF = "Grass fed beef";
    private final static String OATS = "Gluten free oats";

    public static Map<String, Supplier> getAllProductsCollection() {
        Map<String, Supplier> allProducts = new HashMap<>();
        allProducts.put(APPLES, new HealthyShop("Healthy Shop", 20));
        allProducts.put(BEEF, new ExtraFoodShop("Extra Food Shop", 10));
        allProducts.put(OATS, new GlutenFreeShop("Gluten Free Shop", 5000));
        return allProducts;
    }
}
