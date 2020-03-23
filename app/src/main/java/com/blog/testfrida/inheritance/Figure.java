package com.blog.testfrida.inheritance;

public abstract class Figure {

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double perimeter();

    public abstract double area();
}
