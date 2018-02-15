package com.kodilla.testing.shape;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getField() {
        return Math.pow(side,2);
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}
