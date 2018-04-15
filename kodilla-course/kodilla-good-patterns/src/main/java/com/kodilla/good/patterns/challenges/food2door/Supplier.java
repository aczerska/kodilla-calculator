package com.kodilla.good.patterns.challenges.food2door;

public abstract class Supplier {

    private String supplierName;
    private String productName;
    private double onShelfQuantity;
    private double orderedQuantity;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getDescription() {
        return "\nSupplier: " + getSupplierName() +
                "\nProduct name: "  + getProductName() +
                "\nProduct availability: " + getOnShelfQuantity();
    }

    public abstract boolean process();

    public String getTransactionSummary(boolean processed) {
        if(processed) {
            return "\nTransaction completed successfully. \nYou just ordered: " + getOrderedQuantity() +
                    " of " + getProductName() + " from " + getSupplierName() +
                    "\nRemaining available quantity of product: " + (getOnShelfQuantity() - getOrderedQuantity()) +
                    "\n------------------------------";
        }
        return "\nTransaction could not be finalized.\nRemaining available quantity of " + getProductName() +
                "in " + getSupplierName() + " is: " + getOnShelfQuantity();
    }
}
