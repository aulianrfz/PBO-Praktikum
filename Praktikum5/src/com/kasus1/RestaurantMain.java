package com.kasus1;

/**
 * Kelas ini merupakan kelas utama (main class) yang digunakan untuk
 * mengelola pesanan makanan di restoran. Program ini memungkinkan pengguna
 * untuk melihat daftar menu makanan dan memesan makanan.
 *
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-24
 */

import java.util.Scanner;

public class RestaurantMain {
    /**
     * Metode utama untuk menjalankan program pesanan makanan.
     *
     * @param args Argumen dari command line (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        // Membuat objek untuk menu restoran
        Restaurant menu = new Restaurant();

        // Menambahkan menu-menu makanan
        menu.addItemMenu("Bala-Bala", 10_000, 20);
        Restaurant.nextId();
        menu.addItemMenu("Gehu", 10_000, 20);
        Restaurant.nextId();
        menu.addItemMenu("Tahu", 10_000, 20);
        Restaurant.nextId();
        menu.addItemMenu("Molen", 10_000, 20);

        // Inisialisasi scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        char orderMore = 'y';

        // Memproses pesanan makanan
        while (orderMore == 'y') {
            menu.displayMenu();
            System.out.print("Pilih pesanan (1-4): ");
            String input = scanner.nextLine();

            try {
                int id = Integer.parseInt(input);
                if (id >= 1 && id <= Restaurant.getId()) {
                    // Memesan makanan berdasarkan ID
                    menu.orderItem(id);
                } else {
                    System.out.println("ID makanan tidak valid. Silakan coba lagi.\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan ID makanan dengan benar.\n");
                continue;
            }

            // Meminta pengguna untuk memesan makanan lain atau tidak
            System.out.print("\nApakah ingin memesan makanan lain? (y/n): ");
            orderMore = scanner.next().charAt(0);
        }

        // Menutup scanner
        scanner.close();
    }
}
