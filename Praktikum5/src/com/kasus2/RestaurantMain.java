package com.kasus2;

/**
 * Kelas ini merupakan kelas utama (main class) yang digunakan untuk
 * mengelola pesanan makanan di restoran. Program ini memungkinkan pengguna
 * untuk melihat daftar menu makanan, memesan makanan, dan menghitung total harga pesanan.
 *
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-24
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMain {
    
    /**
     * Metode utama untuk menjalankan program pesanan makanan.
     *
     * @param args Argumen dari command line (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {       
      
        // Membuat objek untuk produk dan menu item
        Produk product = new Produk();
        MenuItem menuItem = new MenuItem(product);
        
        // Menambahkan menu-menu makanan
        menuItem.addItemMenu("Onde-onde", 2000, 25);
        menuItem.addItemMenu("Klepon", 2000, 25);
        menuItem.addItemMenu("Pukis", 2000, 25);
        menuItem.addItemMenu("Nagasari", 3000, 25);
        menuItem.addItemMenu("Serabi", 4000, 25);
        menuItem.addItemMenu("Kue Putu", 2000, 25);      
        menuItem.addItemMenu("Leker", 5000, 25);
        menuItem.addItemMenu("Getuk", 3000, 25);
        menuItem.addItemMenu("Molen", 2000, 25);
        menuItem.addItemMenu("Kue Ape", 2000, 25);
        menuItem.addItemMenu("Kue Lapis", 2000, 25);      
        menuItem.addItemMenu("Bika Ambon", 3000, 25);
        menuItem.addItemMenu("Lumpia ", 5000, 25);
        
        // Inisialisasi scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan pilihan pengguna
        char choice;
        boolean orderMore = true;

        // Memproses pesanan makanan
        while (orderMore) {
            menuItem.displayMenu();
            System.out.print("Pilih pesanan (1-13): ");
            int id = scanner.nextInt();
            scanner.nextLine();  

            // Memeriksa validitas pilihan pengguna
            if (id >= 1 && id <= Produk.getId()) {
                System.out.print("Masukkan jumlah pesanan untuk " + product.getNamaMakanan()[id] + ": ");
                int kuantitas = scanner.nextInt();
                scanner.nextLine();  

                menuItem.orderItem(id, kuantitas);
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
                continue;
            }
            
            // Memeriksa apakah pengguna ingin memesan makanan lain
            do{
                System.out.print("\nApakah Anda ingin memesan makanan lain? (y/n): ");
                choice = scanner.next().charAt(0);
                if(choice == 'y'){
                    orderMore = true;
                }else if(choice == 'n'){
                    orderMore = false;
                }
            }while(choice != 'y' && choice != 'n');
            
            scanner.nextLine();
        }

        // Menampilkan total pesanan
        ArrayList<Penjualan> penjualanList = menuItem.getPenjualanList();
        System.out.println("\n================= TOTAL PESANAN ===============");
        for (Penjualan penjualan : penjualanList) {
            System.out.println("Nama Produk: " + penjualan.getNamaProduk());
            System.out.println("kuantitas: " + penjualan.getKuantitas());
            System.out.println("Harga Total: Rp. " + penjualan.getHargaTotal() + "\n");
        }

        // Menghitung dan menampilkan harga total keseluruhan
        double totalHarga = menuItem.hitungTotalHarga();
        System.out.println("Harga Total Keseluruhan: Rp. " + totalHarga);
        System.out.println("==============================================");

        // Menutup scanner
        scanner.close();
    }
}