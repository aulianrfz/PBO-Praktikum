package com.exercise1;

/**
 * Kelas Circle merepresentasikan sebuah lingkaran dengan radius dan warna.
 * Circle memiliki kemampuan untuk menghitung luas, mendapatkan radius, mendapatkan warna,
 * mengubah warna, dan menghasilkan representasi String.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class Circle {

    private double radius;
    private String color;

    public Circle() { 
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) { 
        radius = r;
        color = "red";
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
    
    
}
