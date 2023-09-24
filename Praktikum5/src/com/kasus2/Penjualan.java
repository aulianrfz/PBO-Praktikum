package com.kasus2;

/**
 * Kelas ini merepresentasikan informasi penjualan suatu produk.
 * Setiap penjualan memiliki nama produk, kuantitas, dan harga total.
 * Kelas ini menyediakan metode untuk mengakses dan mengubah informasi penjualan.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-24
 */

public class Penjualan {
    private String namaProduk;  // Nama produk yang dijual
    private int kuantitas;  // Kuantitas produk yang dijual
    private double hargaTotal;  // Harga total dari penjualan

    /**
     * Konstruktor untuk kelas Penjualan.
     *
     * @param namaProduk Nama produk yang dijual.
     * @param kuantitas Kuantitas produk yang dijual.
     * @param hargaTotal Harga total dari penjualan.
     */
    public Penjualan(String namaProduk, int kuantitas, double hargaTotal) {
        this.namaProduk = namaProduk;
        this.kuantitas = kuantitas;
        this.hargaTotal = hargaTotal;
    }

    /**
     * Mendapatkan nama produk dari penjualan.
     *
     * @return Nama produk dari penjualan.
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    /**
     * Mengubah nama produk dari penjualan.
     *
     * @param namaProduk Nama produk baru.
     */
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    /**
     * Mendapatkan kuantitas produk dari penjualan.
     *
     * @return Kuantitas produk dari penjualan.
     */
    public int getKuantitas() {
        return kuantitas;
    }

    /**
     * Mengubah kuantitas produk dari penjualan.
     *
     * @param kuantitas Kuantitas produk baru.
     */
    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    /**
     * Mendapatkan harga total dari penjualan.
     *
     * @return Harga total dari penjualan.
     */
    public double getHargaTotal() {
        return hargaTotal;
    }

    /**
     * Mengubah harga total dari penjualan.
     *
     * @param hargaTotal Harga total baru.
     */
    public void setHargaTotal(double hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
}
