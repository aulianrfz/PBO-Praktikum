package com.exercise2;

/**
 * Kelas TestRextangle adalah kelas untuk menguji fungsionalitas kelas Rectangle.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class TestRectangle {

    public static void main(String[] args) {
        // Menguji konstraktor
        Rectangle rectangle1 = new Rectangle(); 
        System.out.println("Rectangle 1: " + rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(3.7, 4.5);
        System.out.println("Rectangle 2: " + rectangle2.toString());

        // Menguji getter setter
        rectangle1.setWidth(4.0);
        rectangle1.setLength(5.8);

        System.out.println("Rectangle 1 (updated):");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
