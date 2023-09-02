package com.soal3;

class FloatingPoint{
    
    public static void main(String[] args) {
        double x = 92.98; 
        int nx = (int)Math.round(x);
        
        System.out.println("Nilai sebelum menggunakan round = " +x);
        System.out.println("Nilai setelah menggunakan round = "+nx);
    }
}
