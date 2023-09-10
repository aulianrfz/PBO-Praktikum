package com.soal;

/**
 * Program untuk menghitung jumlah gaji agen berdasarkan ketentuan
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-10
 */

import java.util.Scanner;

public class gajiAgent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input jumlah penjualan bulan ini
        System.out.print("Jumlah penjualan : ");
        int penjualan = input.nextInt();

        double gajiPokok = 500000;          // gaji pokok per bulan
        double hargaPerItem = 50000;        // harga per item
        double bonus = 0;                   // bonus penjualan

        // Pengecekan terhadap jumlah penjualan
        if (penjualan >= 15 && penjualan < 40) {
            bonus = penjualan * 0.1 * hargaPerItem;
        } else if (penjualan >= 40 && penjualan <= 80) {
            bonus = penjualan * 0.25 * hargaPerItem;
        } else if (penjualan > 80) {
            bonus = penjualan * 0.35 * hargaPerItem;
        } else {
            // Jika penjualan kurang dari 15 item, denda 15% dari selisih
            double denda = (15 - penjualan) * 0.15 * hargaPerItem;
            bonus = -denda;
        }

        // Total gaji yang diterima
        double totalGaji = gajiPokok + bonus;

        // Cetak gaji yang diterima
        System.out.println("Gaji yang diterima: Rp. " + totalGaji);

        input.close();
    }
}

