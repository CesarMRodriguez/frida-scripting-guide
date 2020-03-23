package com.blog.testfrida.inheritance;

public class Square extends Figure {

    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double perimeter() {
        return 4 * sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }

    public String getSquareName() { return "Square name"; }
}
