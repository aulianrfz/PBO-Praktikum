package com.exercise2;

/**
 * Kelas Rectangle adalah subclass dari kelas Shape yang merepresentasikan bentuk persegi panjang.
 * Kelas ini memiliki informasi tambahan berupa lebar (width) dan panjang (length) persegi panjang.
 * Rectangle memiliki metode untuk menghitung luas, keliling, dan mendapatkan/mengatur lebar dan panjang.
 * Kelas ini juga memiliki metode untuk menghasilkan representasi String dari persegi panjang.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
        super();  
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super(); 
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);  
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + 
                ", which is a subclass of " + super.toString();
    }
}
