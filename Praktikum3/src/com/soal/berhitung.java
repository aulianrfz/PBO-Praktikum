package com.soal;

/**
 * Program untuk melakukan operasi pada dua buah bilangan
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-10
 */

import java.util.Scanner;

public class berhitung {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ketentuan Bilangan : \n1 ≤ Bilangan ≤ 1.000\n"
                + "Saat pembagian, A harus habis dibagi B");
        System.out.println("\nContoh operasi : 6 + 3\n");
        
        while (true) {
            System.out.print("Masukkan operasi = ");
            String operation = input.nextLine();

            // Membagi operasi menjadi angka dan operator
            String[] parts = operation.split(" ");
            if (parts.length != 3) {
                System.out.println("Operasi tidak valid, masukkan kembali operasi.\n");
                continue; // Minta input ulang jika format salah
            }

            int A, B, result;
            char operator;

            // Menggunakan penanganan untuk menghindari error
            try {
                A = Integer.parseInt(parts[0]);
                operator = parts[1].charAt(0);
                B = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid. Coba lagi.");
                continue; // Minta input ulang jika ada kesalahan
            }

            // Memeriksa apakah A dan B berada dalam rentang 1 - 1000
            if (A < 1 || A > 1000 || B < 1 || B > 1000) {
                System.out.println("A dan B harus berada dalam rentang 1 hingga 1000, masukkan kembali.\n");
                continue; // Minta input ulang jika nilai di luar batas
            }

            result = 0;

            // Melakukan operasi sesuai operator
            switch (operator) {
                case '+':
                    result = A + B;
                    break;
                case '-':
                    result = A - B;
                    break;
                case '*':
                    result = A * B;
                    break;
                case '/':
                    // Jika A tidak habis dibagi B
                    if(A % B != 0){
                        System.out.println("Bilangan harus dapat dibagi habis, "
                                + "masukkan kembali bilangan.\n");
                        continue;
                    }else {
                        result = A / B;
                        break;
                    }
                case '%':
                    result = A % B;
                    break;
                default:
                    System.out.println("Operator tidak valid. Coba lagi.");
                    continue; 
            }

            // Menampilkan hasil
            System.out.println("Hasil = " + result);
            break;
        }

        input.close();
    }
}
