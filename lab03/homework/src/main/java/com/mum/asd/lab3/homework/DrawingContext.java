package com.mum.asd.lab3.homework;

public class DrawingContext {

    private DrawingStrategy drawingStrategy;

    public DrawingStrategy getDrawingStrategy() {
        return drawingStrategy;
    }

    public void setDrawingStrategy(DrawingStrategy drawingStrategy) {
        this.drawingStrategy = drawingStrategy;
    }

    public void draw() {
        drawingStrategy.draw();
    }
}
