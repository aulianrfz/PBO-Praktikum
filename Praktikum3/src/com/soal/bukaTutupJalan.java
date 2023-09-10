package com.soal;

/**
 * Program untuk menentukan apakah keempat mobil berhenti atau jalan pada buka tutup jalan
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-10
 */

import java.util.Scanner;

public class bukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] platNomorMobil = new String[4];
        
        boolean semuaValid = false;
        
        // Validasi input 
        while (!semuaValid) {
            semuaValid = true; 
            
            System.out.println("Masukkan 4 plat nomor (4 digit) = ");
            String plat = scanner.nextLine();

            platNomorMobil = plat.split(" ");

            // Cek apakah plat memiliki 4 karakter
            for (int i = 0; i < 4; i++) {
                if (platNomorMobil[i].length() != 4) {
                    System.out.println("Plat nomor harus memiliki 4 karakter.\n");
                    semuaValid = false;  
                    break; 
                }
            }
        }
        
        // Menggabungkan plat nomor mobil
        StringBuilder platNomorGabungan = new StringBuilder();
        for (String platNomor : platNomorMobil) {
            platNomorGabungan.append(platNomor);
        }

        // Mengonversi ke long
        long angkaGabungan = Long.parseLong(platNomorGabungan.toString());

        // Memeriksa apakah mobil harus berhenti atau tidak
        if ((angkaGabungan - 999999) % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
