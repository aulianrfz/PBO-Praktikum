package com.kasus2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + " with radius " + this.radius + 
                " and height " + this.height;
    }
}
