package com.soal;

/**
 * Program untuk melakukan penjumlahan dan perkalian pada bilangan besar
 * @author Aulia Nurul Fauziah
 * @version 1.0
 * @since 2023-09-10
 */


import java.math.BigInteger;
import java.util.Scanner;

public class bigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ketentuan : \nNilai yang di input harus bilangan non negatif dan max 200 digit!\n");

        // Meminta input a yang valid
        String inputA;
        do {
            System.out.print("Masukkan nilai a = ");
            inputA = scanner.nextLine();
        } while (!isValidInput(inputA) || inputA.length() > 200);

        // Meminta input b yang valid
        String inputB;
        do {
            System.out.print("Masukkan nilai b = ");
            inputB = scanner.nextLine();
        } while (!isValidInput(inputB) || inputB.length() > 200);

        // Mengonversi input ke BigInteger
        BigInteger a = new BigInteger(inputA);
        BigInteger b = new BigInteger(inputB);

        // Mencetak hasil input dan hasil perhitungan
        System.out.println("\nInput a = " + a);
        System.out.println("Input b = " + b);

        // Menghitung hasil penjumlahan dan perkalian
        BigInteger sum = a.add(b);
        BigInteger multiply = a.multiply(b);

        System.out.println("\n" + a + " + " + b + " = " + sum);
        System.out.println(a + " x " + b + " = " + multiply);

        scanner.close();
    }

    // Metode untuk memeriksa apakah string adalah bilangan non-negatif
    private static boolean isValidInput(String str) {
        try {
            BigInteger num = new BigInteger(str);
            return num.compareTo(BigInteger.ZERO) >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
