package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getField() {
        return height * base / 2;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}
