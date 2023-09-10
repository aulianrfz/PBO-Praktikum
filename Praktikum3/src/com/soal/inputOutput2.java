package com.soal;

/**
 * Program untuk memisahkan string menjadi string dan bilangan
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-10
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputOutput2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Format input (String)(Spasi)(Bilangan)\n"
                + "Contoh : java 100\n");

        // Banyaknya input yang diinginkan
        System.out.print("Banyaknya input : ");
        int jumlahMasukan = input.nextInt();
        System.out.println(" ");
        input.nextLine(); 

        // Untuk menampung inputan
        List<String> inputs = new ArrayList<>();

        int masukanKe = 1; // Menghitung banyaknya inputan

        while (masukanKe <= jumlahMasukan) {
            System.out.print("Input ke-" + masukanKe + " : ") ;
            String line = input.nextLine();

            // Validasi format
            if (!isValidFormat(line)) {
                System.out.println("Format tidak valid, input kembali.");
                continue;
            }

            // Memisahkan input menjadi dua bagian (String dan bilangan)
            String[] parts = line.split(" ");
            String str = parts[0];
            int num = Integer.parseInt(parts[1]);

            // Memeriksa apakah bilangan memiliki rentang 0 - 999
            if (num < 0 || num > 999) {
                System.out.println("Angka harus berada pada rentang 0 - 999, input kembali.");
                continue;
            }

            inputs.add(line);
            masukanKe++;
        }

        // Cetak hasil setelah semua input selesai
        System.out.println("\nHasil:");

        for (String inputLine : inputs) {
            // Memisahkan input menjadi dua bagian (String dan bilangan)
            String[] parts = inputLine.split(" ");
            String str = parts[0];
            int num = Integer.parseInt(parts[1]);

            // Format output sesuai dengan ketentuan
            System.out.printf("%.15s\t%03d\n", str.toLowerCase(), num);
        }

        input.close();
    }

    // Method untuk memeriksa validasi input
    private static boolean isValidFormat(String input) {
        
        // Memeriksa apakah input memiliki 2 bagian
        String[] parts = input.split(" ");
        if (parts.length != 2) {
            return false;
        }
        
        // Memeriksa apakah bagian kedua dapat dijadikan bilangan
        try {
            Integer.parseInt(parts[1]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
