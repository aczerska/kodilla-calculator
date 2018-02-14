package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getField() {
        return 3.14 * Math.pow(radius,2);
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}
