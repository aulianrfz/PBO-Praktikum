package com.kasus2;

/**
 * Kelas ini merepresentasikan daftar menu makanan di restoran.
 * Setiap menu memiliki informasi seperti nama, harga, dan stok.
 * Kelas ini juga menyediakan metode untuk menambahkan item menu, menampilkan menu,
 * memesan item menu, menghitung harga total pesanan, serta mendapatkan daftar penjualan.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-24
 */

import java.util.ArrayList;

public class MenuItem {
    private Produk product;  // Produk yang terkait dengan menu
    private ArrayList<Penjualan> penjualanList;  // Daftar penjualan
    private int lastOrderedId = -1;  // ID pesanan terakhir

    /**
     * Konstruktor untuk kelas MenuItem.
     *
     * @param product Objek produk yang terkait dengan menu.
     */
    public MenuItem(Produk product) {
        this.product = product;
        this.penjualanList = new ArrayList<>();
    }

    /**
     * Menambahkan item menu dengan nama, harga, dan stok tertentu.
     *
     * @param nama Nama makanan.
     * @param harga Harga makanan.
     * @param stok Stok makanan.
     */
    public void addItemMenu(String nama, double harga, int stok) {
        product.getNamaMakanan()[Produk.getId()] = nama;
        product.getHargaMakanan()[Produk.getId()] = harga;
        product.getStok()[Produk.getId()] = stok;
        Produk.nextId();
    }

    /**
     * Menampilkan menu makanan beserta informasinya.
     */
    public void displayMenu() {
        System.out.println("===================== MENU JAJANAN ===================");
        for (int i = 1; i <= Produk.getId(); i++) {
            if (!cekStok(i)) {
                System.out.println(i + ". " + product.getNamaMakanan()[i] + "\t\t [" + product.getStok()[i]
                        + "] \t\tRp. " + product.getHargaMakanan()[i]);
            }
        }
        System.out.println("======================================================");
    }

    /**
     * Memesan item menu berdasarkan ID dan kuantitas.
     *
     * @param id ID makanan yang ingin dipesan.
     * @param kuantitas Jumlah makanan yang ingin dipesan.
     */
    public void orderItem(int id, int kuantitas) {
        if (id >= 1 && id <= Produk.getId()) {
            if (product.getStok()[id] >= kuantitas) {
                // Jika pesanan sama dengan pesanan sebelumnya
                if (id == lastOrderedId) {
                    // Update stok dan harga total
                    product.getStok()[id] -= kuantitas;
                    for (Penjualan penjualan : penjualanList) {
                        if (penjualan.getNamaProduk().equals(product.getNamaMakanan()[id])) {
                            int newkuantitas = penjualan.getKuantitas() + kuantitas;
                            penjualan.setKuantitas(newkuantitas);
                            penjualan.setHargaTotal(product.getHargaById(id) * newkuantitas);
                            break;
                        }
                    }
                } else {
                    // Pesanan baru
                    product.getStok()[id] -= kuantitas;
                    double hargaTotal = product.getHargaById(id) * kuantitas;

                    Penjualan penjualan = new Penjualan(product.getNamaMakanan()[id], kuantitas, hargaTotal);
                    penjualanList.add(penjualan);

                    lastOrderedId = id;  // Update ID pesanan terakhir
                }
                System.out.println("\n================= RINCIAN PESANAN ===============");
                System.out.println("Pesanan Anda: " + product.getNamaMakanan()[id] + " (" + kuantitas + " pcs)");
                System.out.println("Harga Total: Rp. " + getHargaById(id) * kuantitas);
                System.out.println("\n=================================================");
            } else {
                System.out.println("Maaf, " + product.getNamaMakanan()[id] + " tidak mencukupi.");
            }
        } else {
            System.out.println("ID makanan tidak valid.");
        }
    }

    /**
     * Mendapatkan harga dari item menu berdasarkan ID.
     *
     * @param id ID makanan yang ingin diakses.
     * @return Harga item menu berdasarkan ID.
     */
    public double getHargaById(int id) {
        return product.getHargaMakanan()[id];
    }

    /**
     * Mendapatkan daftar penjualan.
     *
     * @return Daftar penjualan.
     */
    public ArrayList<Penjualan> getPenjualanList() {
        return penjualanList;
    }

    /**
    * Metode ini digunakan untuk memeriksa apakah stok makanan dengan ID tertentu habis atau tidak.
    * 
    * @param id ID makanan yang ingin diperiksa stoknya.
    * @return Mengembalikan true jika stok makanan habis (0), dan false jika masih ada stok.
    */
    private boolean cekStok(int id) {
        return product.getStok()[id] == 0;
    }

    /**
    * Metode ini digunakan untuk menghitung harga total dari seluruh pesanan dalam daftar penjualan.
    * 
    * @return Harga total dari seluruh pesanan dalam daftar penjualan.
    */
    public double hitungTotalHarga() {
        double totalHarga = 0;
        
        // Menjumlahkan harga total dari setiap pesanan
        for (Penjualan penjualan : penjualanList) {
            totalHarga += penjualan.getHargaTotal();
        }
        return totalHarga;
    }

}
