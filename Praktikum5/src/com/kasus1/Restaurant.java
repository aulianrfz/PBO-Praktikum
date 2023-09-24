package com.kasus1;

/**
 * Kelas ini merepresentasikan sebuah restoran yang menyediakan makanan.
 * Restoran memiliki daftar makanan beserta harga dan stoknya.
 * Kelas ini juga menyediakan metode untuk menambahkan item menu, menampilkan menu,
 * memeriksa stok, memesan item menu, dan mendapatkan ID.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-24
 */

public class Restaurant {
    private String[] namaMakanan;  // Nama makanan
    private double[] hargaMakanan;  // Harga makanan
    private int[] stok;  // Stok makanan
    private static byte id = 1;  // ID makanan

    /**
     * Konstruktor untuk kelas Restaurant.
     * Inisialisasi array namaMakanan, hargaMakanan, dan stok dengan ukuran 10.
     */
    public Restaurant() {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    /**
     * Menambahkan item menu dengan nama, harga, dan stok tertentu.
     *
     * @param nama Nama makanan.
     * @param harga Harga makanan.
     * @param stok Stok makanan.
     */
    public void addItemMenu(String nama, double harga, int stok) {
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
    }

    /**
     * Menampilkan menu makanan beserta informasinya.
     */
    public void displayMenu() {
        for (int i = 1; i <= id; i++) {
            if (!cekStok(i)) {
                System.out.println(i + ". "+ namaMakanan[i] + "[" + stok[i] 
                        + "]" + "\t\tRp. " + hargaMakanan[i]);
            } 
        }
    }

    /**
     * Memeriksa apakah stok makanan habis.
     *
     * @param id ID makanan yang ingin diperiksa stoknya.
     * @return Mengembalikan true jika stok makanan habis (0), dan false jika masih ada stok.
     */
    public boolean cekStok(int id) {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Menghasilkan ID untuk makanan selanjutnya.
     */
    public static void nextId() {
        id++;
    }
    
    /**
     * Memesan item menu berdasarkan ID.
     *
     * @param id ID makanan yang ingin dipesan.
     */
    public void orderItem(int id) {
        if (id >= 0 && id <= this.id) {
            if (stok[id] > 0) {
                stok[id]--;
                System.out.println("Pesanan Anda untuk " + namaMakanan[id] + " telah diterima.");
            } else {
                System.out.println("Maaf, " + namaMakanan[id] + " sedang habis.");
            }
        } else {
            System.out.println("ID makanan tidak valid.");
        }
    }
    
    /**
     * Mendapatkan ID makanan saat ini.
     *
     * @return ID makanan saat ini.
     */
    public static byte getId() {
        return id;
    }

}
