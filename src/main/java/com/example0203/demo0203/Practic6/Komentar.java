package com.example0203.demo0203.Practic6;

public class Komentar {
    /**
     * Menghitung jumlah dari dua nilai.
     *
     * @param a Nilai pertama.
     * @param b Nilai kedua.
     * @return Hasil penjumlahan dari a dan b.
     */
    static int sum(int a, int b) {
        // Melakukan penjumlahan a dan b
        return a + b;
    }

    public static void main(String[] args) {
        // Memanggil metode sum dengan nilai-nilai yang ingin dijumlahkan
        int hasil = sum(5, 7);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
