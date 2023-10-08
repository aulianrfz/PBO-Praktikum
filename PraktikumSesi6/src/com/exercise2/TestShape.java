package com.exercise2;

/**
 * Kelas TestShape adalah kelas untuk menguji fungsionalitas kelas Shape.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class TestShape {

    public static void main(String[] args) {
        // Menguji konstraktor
        Shape shape1 = new Shape();
        System.out.println("Shape 1: " + shape1.toString());

        Shape shape2 = new Shape("purple", false); 
        System.out.println("Shape 2: " + shape2.toString());

        // Menguji getter setter
        shape1.setColor("red");
        shape1.setFilled(true);

        System.out.println("Shape 1 (updated):");
        System.out.println("Color: " + shape1.getColor());
        System.out.println("Filled: " + shape1.isFilled());

        // Menguji metode toString()
        System.out.println("Shape 1 (after updates): " + shape1.toString());
    }
}
