package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapesArrayList = new ArrayList<>();

    public ShapeCollector() {
    }
    //zgodnie z komentarzem miałem skasować tego gettera, ale w takim razie jak mam się odwołać do listy w testach?
    public List<Shape> getShapesArrayList(){
        return  shapesArrayList;
    }

    public void addFigure(Shape shape) {
        shapesArrayList.add(shape);
    }

    public  boolean removeFigure(int figureNumber){
        boolean result = false;
        if (figureNumber>=0 && figureNumber<shapesArrayList.size()) {
            shapesArrayList.remove(figureNumber);
            result = true;
        }
        return result;
    }

    public void showFigures(){
        Iterator<Shape> iteratorArrayList = getShapesArrayList().iterator();
        while (iteratorArrayList.hasNext()){
            Shape currentShape = iteratorArrayList.next();
            System.out.println("Shape: " + currentShape.getShapeName() + " Field: " + currentShape.getField() + "/n");
        }
    }

    public Shape getFigure(int figureNumber2){
        Shape shape = null;
        if (figureNumber2>=0 && figureNumber2<shapesArrayList.size()) {
            shape = shapesArrayList.get(figureNumber2);
        }
        return shape;
    }
}
