package com.soal5;

import java.util.Scanner;

/**
 * Program untuk melakukan berbagai operasi pada dua kata, termasuk 
 * menghitung jumlah karakter, membandingkan kata berdasarkan urutan 
 * leksikografi, dan menggabungkan kata dengan huruf pertama dari 
 * setiap kata menjadi huruf kapital.
 * 
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-02
 */

public class Strings{
    
    /**
    * Metode utama program untuk melakukan berbagai operasi pada dua kata.
    * @param args argumen baris perintah (tidak digunakan dalam program ini)
    */
    public static void main(String[] args){
        
        // Input kata pertama dan kedua 
        System.out.println("========= INPUT KATA =========");
        String kata1 = inputKata("Masukkan kata pertama = ");
        String kata2 = inputKata("Masukkan kata kedua = ");
        
        System.out.println("\nKata pertama = " +kata1);
        System.out.println("Kata kedua = " +kata2);
        
        // Menghitung jumlah karakter dari kedua kata
        System.out.println("\n======= JUMLAH KARAKTER =======");
        int panjang1 = panjangKarakter(kata1);
        int panjang2 = panjangKarakter(kata2);
        int jumlah = jumlahKarakter(kata1, kata2);
        System.out.println("Panjang kata pertama = " + panjang1);
        System.out.println("Panjang kata kedua = " + panjang2);
        System.out.println("Jumlah panjang kedua kata = " + jumlah);

        // Membandingkan kedua kata berdasarkan leksikografi
        System.out.println("\n======== PERBANDINGAN KATA ========");
        String hasilPerbandingan = bandingkanKata(kata1, kata2);
        System.out.println(hasilPerbandingan);
        
        // Menggabungkan kedua kata dengan huruf pertama setiap kata menjadi kapital
        System.out.println("\n======== GABUNGAN KATA ========");
        String upperKata1 = upperKataAwal(kata1);
        String upperKata2 = upperKataAwal(kata2);

        System.out.println(upperKata1 + " " + upperKata2);
    }

    /**
    * Metode ini digunakan untuk mengambil input kata dari pengguna
    * @param prompt pesan yang akan ditampilkan kepada pengguna sebelum menginputkan kata
    * @return kata yang diinputkan oleh pengguna dalam bentuk huruf kecil
    */
    public static String inputKata(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        String kata = input.nextLine();
        return kata.toLowerCase();
    }    
    
    /**
    * Metode ini menghitung jumlah karakter total dari dua kata
    * @param kataPertama kata pertama
    * @param kataKedua kata kedua
    * @return jumlah karakter total dari kedua kata
    */
    public static int jumlahKarakter(String kataPertama, String kataKedua){
        int panjang1 = panjangKarakter(kataPertama);
        int panjang2 = panjangKarakter(kataKedua);
        int jumlah = panjang1 + panjang2;
        return jumlah;
    }
    
    /**
    * Metode ini menghitung jumlah karakter dalam suatu kata
    * @param kata kata yang akan dihitung panjang karakternya
    * @return jumlah karakter dalam kata
    */
    public static int panjangKarakter(String kata){
        int panjang = kata.length();
        return panjang;
    }
    
    /**
    * Metode ini membandingkan dua kata berdasarkan urutan leksikografi
    * @param kata1 kata pertama yang akan dibandingkan
    * @param kata2 kata kedua yang akan dibandingkan
    * @return pesan yang menyatakan hubungan leksikografi antara kedua kata
    */
    public static String bandingkanKata(String kata1, String kata2){
        int hasil = kata1.compareTo(kata2);
        if (hasil < 0) {
            return "Kata pertama lebih kecil dari kata kedua";
        }else if (hasil > 0) {
            return "Kata pertama lebih besar dari kata kedua";
        }else {
            return "Kata pertama sama dengan kata kedua kedua";
        }
    }    
    
    /**
    * Metode ini untuk mengubah huruf pertama dari kata menjadi huruf kapital
    * @param kata merupakan kata yang akan diubah huruf pertamanya menjadi kapital
    * @return kata yang telah diubah huruf pertamanya menjadi huruf kapital
    */
    public static String upperKataAwal(String kata){
        String upper = kata.substring(0, 1).toUpperCase() + kata.substring(1);
        return upper;
    }
    
}

