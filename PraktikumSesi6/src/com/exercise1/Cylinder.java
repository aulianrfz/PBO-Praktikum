package com.exercise1;

/**
 * Kelas Cylinder adalah turunan dari kelas Circle yang merepresentasikan sebuah silinder.
 * Kelas ini memiliki informasi mengenai radius, tinggi, dan warna dari silinder.
 * Cylinder memiliki kemampuan untuk menghitung luas permukaan, tinggi, volume, dan
 * menghasilkan representasi String.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super(); 
        height = 1.0;
    }

    public Cylinder(double height) {
        super(); 
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius); 
        this.height = height;
    }
    
    public Cylinder(double radius, String color, double height) {
        super(radius, color); 
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.PI * super.getRadius() * this.height + 2 * super.getArea();
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() { 
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }

}
