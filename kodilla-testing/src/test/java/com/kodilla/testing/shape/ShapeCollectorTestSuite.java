package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
private static int testCounter = 0;

    @BeforeClass
    public static void startTests() {
        System.out.println("Start tests");}
    @AfterClass
    public static void endTests() {
        System.out.println("End tests");}
    @Before
    public void beforeAlltests() {
        testCounter++;
        System.out.println("Next test, no. " + testCounter);}

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(2,1);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapesArrayList().size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(2,1);
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(0);
        //Then
        Assert.assertEquals(0, shapeCollector.getShapesArrayList().size());
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(1);
        Square square2 = new Square(2);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square2);
        //When
        Shape retrievedShape = shapeCollector.getFigure(0);
        Shape retrievedShape2 = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(square, retrievedShape);
        Assert.assertEquals(square2, retrievedShape2);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);
        //When
        shapeCollector.addFigure(circle);
        Shape retrievedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, retrievedShape);
    }
}
