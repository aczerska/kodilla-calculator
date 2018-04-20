package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;
import java.util.Objects;

public abstract class Supplier {

    private String supplierName;
    private double onShelfQuantity;

    public Supplier(String supplierName, double onShelfQuantity) {
        this.supplierName = supplierName;
        this.onShelfQuantity = onShelfQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public double getOnShelfQuantity() {
        return onShelfQuantity;
    }

    public void setOnShelfQuantity(double onShelfQuantity) {
        this.onShelfQuantity = onShelfQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Double.compare(supplier.onShelfQuantity, onShelfQuantity) == 0 &&
                Objects.equals(supplierName, supplier.supplierName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplierName, onShelfQuantity);
    }

    public abstract boolean process(String selectedProduct, double selectedProductQuantity, Map<String, Supplier> allProduct);

    public void getDescription(String selectedProduct, double selectedProductQuantity) {
        System.out.println("Description of transaction: " + "\nProduct ordered: " + selectedProduct +
                "\nSupplier: " + getSupplierName() +
                "\nOrdered quantity: " + selectedProductQuantity);
    }

    public void getTransactionSummary(boolean processed, String selectedProduct, double selectedProductQuantity) {
        if (processed) {
            System.out.println("\nTransaction completed successfully. \nYou just ordered: " + selectedProductQuantity +
                    " of " + selectedProduct + " from " + getSupplierName() +
                    "\nRemaining available quantity of product: " + getOnShelfQuantity());
        } else {

            System.out.println("\nTransaction could not be processed.\nRemaining available quantity of " +
                    selectedProduct + " in " + getSupplierName() + " is: " + getOnShelfQuantity() +
                    "\nChange quantity of your order and try again!");
        }
    }
}
