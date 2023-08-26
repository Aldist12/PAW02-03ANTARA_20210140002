package com.example0203.demo0203.Practic3;

public class OperasiMatematika {
    public static void main(String[] args) {
        // Operasi matematika
        int a = 100;
        int b = 10;

        System.out.println(a + b); // Penjumlahan: 100 + 10 = 110
        System.out.println(a - b); // Pengurangan: 100 - 10 = 90
        System.out.println(a * b); // Perkalian: 100 * 10 = 1000
        System.out.println(a / b); // Pembagian: 100 / 10 = 10
        System.out.println(a % b); // Modulus (Sisa pembagian): 100 % 10 = 0

        // Augmented assignment (Penugasan dengan operasi)
        int c = 100;

        c += 10; // c = c + 10; => 100 + 10 = 110
        System.out.println(c);

        c -= 10; // c = c - 10; => 110 - 10 = 100
        System.out.println(c);

        c *= 10; // c = c * 10; => 100 * 10 = 1000
        System.out.println(c);
    }
}
