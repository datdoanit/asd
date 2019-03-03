package com.mum.asd.lab3.homework;

public class Application {

    public static void main(String[] args) {
        DrawingStrategy circle = new Circle();
        DrawingStrategy line = new Line();

        DrawingContext drawingContext = new DrawingContext();
        drawingContext.setDrawingStrategy(line);
        drawingContext.draw();

        drawingContext.setDrawingStrategy(circle);
        drawingContext.draw();
        drawingContext.draw();
    }
}
