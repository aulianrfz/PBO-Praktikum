package com.kasus2;

/**
 * Kelas ini merepresentasikan informasi tentang produk makanan di restoran.
 * Setiap produk memiliki nama, harga, dan stok yang tersedia.
 * Kelas ini juga menyediakan metode untuk mengakses informasi produk.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-24
 */

public class Produk {
    private String[] namaMakanan;  // Array untuk menyimpan nama makanan
    private double[] hargaMakanan;  // Array untuk menyimpan harga makanan
    private int[] stok;  // Array untuk menyimpan stok makanan
    private static byte id = 1;  // Identifikasi produk

    /**
     * Konstruktor untuk kelas Produk.
     * Inisialisasi array namaMakanan, hargaMakanan, dan stok dengan ukuran 15.
     */
    public Produk() {
        namaMakanan = new String[15];
        hargaMakanan = new double[15];
        stok = new int[15];
    }

    /**
     * Mendapatkan array nama makanan.
     *
     * @return Array yang berisi nama makanan.
     */
    public String[] getNamaMakanan() {
        return namaMakanan;
    }

    /**
     * Mendapatkan array harga makanan.
     *
     * @return Array yang berisi harga makanan.
     */
    public double[] getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * Mendapatkan array stok makanan.
     *
     * @return Array yang berisi stok makanan.
     */
    public int[] getStok() {
        return stok;
    }

    /**
     * Mendapatkan ID produk saat ini.
     *
     * @return ID produk saat ini.
     */
    public static byte getId() {
        return id;
    }

    /**
     * Menambahkan ID produk untuk produk selanjutnya.
     */
    public static void nextId() {
        id++;
    }

    /**
     * Mendapatkan informasi produk berdasarkan ID.
     *
     * @param id ID produk yang ingin diakses.
     * @return Informasi produk berupa array [namaMakanan, hargaMakanan, stok].
     */
    public String[] getProductInfo(int id) {
        if (id >= 0 && id <= Produk.getId()) {
            String[] info = new String[3];
            info[0] = namaMakanan[id];
            info[1] = Double.toString(hargaMakanan[id]);
            info[2] = Integer.toString(stok[id]);
            return info;
        } else {
            return new String[0];
        }
    }

    /**
     * Mendapatkan harga produk berdasarkan ID.
     *
     * @param id ID produk yang ingin diakses.
     * @return Harga produk berdasarkan ID.
     */
    public double getHargaById(int id) {
        return hargaMakanan[id];
    }
}