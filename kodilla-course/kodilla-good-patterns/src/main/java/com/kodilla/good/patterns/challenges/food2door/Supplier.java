package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public abstract class Supplier {

    private String supplierName;
    private double orderedQuantity;
    private double onShelfQuantity;
    private Product product;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public double getOnShelfQuantity() {
        return onShelfQuantity;
    }

    public void setOnShelfQuantity(double onShelfQuantity) {
        this.onShelfQuantity = onShelfQuantity;
    }

    public double getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(double orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(supplierName, supplier.supplierName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplierName);
    }

    public String getDescription() {
        return "\nSupplier: " + getSupplierName() +
                "\nProduct availability: " + getOnShelfQuantity();
    }

    public abstract boolean process();

    public String getTransactionSummary(boolean processed) {
        if(processed) {
            return "\nTransaction completed successfully. \nYou just ordered: " + getOrderedQuantity() +
                    " of " + product.getProductName() + " from " + getSupplierName() +
                    "\nRemaining available quantity of product: " + (getOnShelfQuantity() - getOrderedQuantity()) +
                    "\n------------------------------";
        }
        return "\nTransaction could not be finalized.\nRemaining available quantity of " + product.getProductName() +
                "in " + getSupplierName() + " is: " + getOnShelfQuantity();
    }
}
