package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @After
    public void afterEveryTest() {
        System.out.println("Unit test completed.");
    }

    @Test
    public void testAddFigure() {
        System.out.println("Testing addFigure()");
        // Given
        ShapeCollector sh = new ShapeCollector();
        Shape square = new Square(3);
        // When
        sh.addFigure(square);
        // Then
        Assert.assertEquals(1,sh.getShapes().size());
        Assert.assertEquals(9,sh.getShapes().get(0).getField(),0.1);
    }

    @Test
    public void testRemoveFigure() {
        System.out.println("Testing removeFigure()");
        // Given
        ShapeCollector sh = new ShapeCollector();
        Shape circle = new Circle(4);
        sh.addFigure(circle);
        // When
        sh.removeFigure(circle);
        // Then
        Assert.assertEquals(0, sh.getShapes().size());
    }

    @Test
    public void testRemoveNonexistentFigure() {
        System.out.println("Testing removeFigure() for non-existing figure");
        // Given
        ShapeCollector sh = new ShapeCollector();
        Shape circle = new Circle(4);
        Shape square = new Square (2);
        sh.addFigure(circle);
        // When
        sh.removeFigure(square);
        // Then
        Assert.assertEquals(1, sh.getShapes().size());
    }

    @Test
    public void testGetFigure() {
        System.out.println("Testing getFigure()");
        // Given
        ShapeCollector sh = new ShapeCollector();
        Shape circle = new Circle(4);
        Shape square = new Square (2);
        Shape triangle = new  Triangle(2,2);
        sh.addFigure(circle);
        sh.addFigure(square);
        sh.addFigure(triangle);
        // When
        sh.getFigure(2);
        //
        Assert.assertEquals(triangle, sh.getShapes().get(2));
        Assert.assertEquals(2,sh.getShapes().get(2).getField(), 0.1);

    }
}
