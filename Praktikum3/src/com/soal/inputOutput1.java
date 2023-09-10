package com.soal;

/**
 * Program untuk menghitung dan mencetak token dari sebuah string
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-10
 */

import java.util.Scanner;

public class inputOutput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Masukkan kalimat : ");
        String s = scanner.nextLine();

        // Pisahkan string berdasarkan karakter non alfabet
        String[] words = s.split("[^a-zA-Z]+");      

        // Hitung jumlah token
        System.out.println("\nJumlah token : " + words.length);
        
        // Cetak setiap token
        System.out.println("Token yang dimasukkan : ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

