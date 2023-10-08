package com.exercise2;

/**
 * Kelas Square adalah subclass dari kelas Rectangle yang merepresentasikan bentuk persegi.
 * Kelas ini merupakan subclass dari Rectangle karena persegi adalah jenis khusus dari persegi panjang.
 * Square memiliki metode untuk menghitung sisi, mendapatkan/ mengatur sisi, dan menghasilkan representasi String.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-07
 */

public class Square extends Rectangle {

    public Square() {
        super();  
    }

    public Square(double side) {
        super(side, side);  
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  
    }

    public double getSide() {
        return super.getWidth();  
    }

    public void setSide(double side) {
        super.setWidth(side); 
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}

