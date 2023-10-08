package com.exercise2;

/**
 * Kelas Shape merepresentasikan bentuk geometris dengan warna dan 
 * status terisi/tidak terisi.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-10-0
 */

public class Shape {
    
    private String color;
    private boolean filled; 
    
    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString() {
        return "Shape[color=" + color + " filled=" + filled + "]";
    }
    
}
