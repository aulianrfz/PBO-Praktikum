package com.exercise2;

/**
 * Kelas TestSquare adalah kelas untuk menguji fungsionalitas kelas Square.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class TestSquare {

    public static void main(String[] args) {
        // Menguji konstraktor
        Square square1 = new Square();
        System.out.println("Square 1: " + square1.toString());

        Square square2 = new Square(4.0); 
        System.out.println("Square 2: " + square2.toString());

        // Menguji getter setter
        square1.setSide(6.5);

        System.out.println("Square 1 (updated):");
        System.out.println("Side: " + square1.getSide());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
    }
}
