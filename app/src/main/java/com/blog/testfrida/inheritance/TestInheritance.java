package com.blog.testfrida.inheritance;

public class TestInheritance {

    public static Figure getCircle() {
        return new Circle(10.0);
    }

    public static double getArea(Figure figure) {
        return figure.area();
    }

    public static double getPerimeter(Figure figure) {
        return figure.perimeter();
    }

}
