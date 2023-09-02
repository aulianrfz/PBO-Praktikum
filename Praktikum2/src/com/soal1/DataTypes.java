package com.soal1;

import java.util.Scanner;

/**
 * Program untuk melakukan pengecekan tipe data yang dapat diakomodasi
 * oleh tipe data byte, short, int, dan long.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-02
 */

public class DataTypes {
    
    /**
    * Metode utama program untuk melakukan pengecekan tipe data yang dapat diakomodasi 
    * oleh byte, short, int, dan long.
    * @param args argumen baris perintah (tidak digunakan dalam program ini)
    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of inputs : ");
        int numInput = input.nextInt();
        
        // Membuat array untuk menyimpan input
        String[] inputStrings = new String[numInput];
        
        // Menyimpan input ke dalam array
        for (int i = 0; i < numInput; i++) {
            System.out.printf("Input %d: ", i + 1);
            inputStrings[i] = input.next();
        }
        
        // Melakukan pengecekan tipe data
        for (int i = 0; i < numInput; i++) {
            String inputStr = inputStrings[i];
            System.out.println("\nInput " + (i + 1) + ": " +inputStr);
            cek(inputStr);
        }
    }
    
    /**
     * Melakukan pengecekan tipe data dan mencetak hasilnya.
     * @param inputStr string input yang akan diperiksa
     */
    public static void cek(String inputStr) {
        try {
            // Mengonversi input string menjadi long
            long nilai = Long.parseLong(inputStr);
            
            System.out.println("Can be fitted in : ");
            // Memeriksa tipe data dan mencetak hasilnya
            if (isByte(nilai)) {
                System.out.println("* byte");
            } if (isShort(nilai)) {
                System.out.println("* short");
            } if (isInt(nilai)) {
                System.out.println("* int");
            } if (isLong(nilai)){
                System.out.println("* long");
            }
        } catch (NumberFormatException e) {
            // Jika tipe data diatas long
            System.out.println("Can't be fitted anywhere.");
        }
    }
    
    /**
     * Mengecek apakah nilai dapat diakomodasi oleh tipe data byte.
     * @param nilai nilai yang akan diperiksa
     * @return true jika dapat diakomodasi oleh byte, false jika tidak
     */
    public static boolean isByte(long nilai) {
        return (nilai >= Byte.MIN_VALUE && nilai <= Byte.MAX_VALUE);
    }

    /**
     * Mengecek apakah nilai dapat diakomodasi oleh tipe data short.
     * @param nilai nilai yang akan diperiksa
     * @return true jika dapat diakomodasi oleh short, false jika tidak
     */
    public static boolean isShort(long nilai) {
        return (nilai >= Short.MIN_VALUE && nilai <= Short.MAX_VALUE);
    }

    /**
     * Mengecek apakah nilai dapat diakomodasi oleh tipe data int.
     * @param nilai nilai yang akan diperiksa
     * @return true jika dapat diakomodasi oleh int, false jika tidak
     */
    public static boolean isInt(long nilai) {
        return (nilai >= Integer.MIN_VALUE && nilai <= Integer.MAX_VALUE);
    }
    
    /**
     * Mengecek apakah nilai dapat diakomodasi oleh tipe data long.
     * @param nilai nilai yang akan diperiksa
     * @return true jika dapat diakomodasi oleh long, false jika tidak
     */
    public static boolean isLong(long nilai) {
        return (nilai >= Long.MIN_VALUE && nilai <= Long.MAX_VALUE);
    }
}
