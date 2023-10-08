package com.exercise2;

/**
 * Kelas Circle adalah subclass dari kelas Shape yang merepresentasikan bentuk lingkaran.
 * Kelas ini memiliki informasi tambahan berupa radius lingkaran, memiliki metode untuk 
 * menghitung luas, keliling, dan mendapatkan/ mengatur radius.
 * Kelas ini juga memiliki metode untuk menghasilkan representasi String dari lingkaran.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }
    
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
    
}
