package com.exercise2;

/**
 * Kelas TestCircle adalah kelas untuk menguji fungsionalitas kelas Circle.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class TestCircle {

    public static void main(String[] args) {
        // Menguji konstraktor
        Circle circle1 = new Circle(); 
        System.out.println("Circle 1: " + circle1.toString());

        Circle circle2 = new Circle(3.5);
        System.out.println("Circle 2: " + circle2.toString());

        // Menguji getter setter
        circle1.setRadius(5.0);

        System.out.println("Circle 1 (updated):");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
    }
}

