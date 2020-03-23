package com.blog.testfrida.inheritance;

public class Circle extends Figure {

    protected double radius;

    public Circle(double r) {
        radius = r;
    }

    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void expand(double scaleFactor) {
        radius *= scaleFactor;
    }

    public String getCircleName() { return "Circle name"; }

}
