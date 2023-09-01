package com.example0203.demo0203.Practic6;

public class FactorialRecursive {
    /**
     * Menghitung faktorial dari suatu angka secara rekursif.
     *
     * @param value Angka untuk menghitung faktorialnya.
     * @return Nilai faktorial dari angka tersebut.
     */
    static int factorialRecursive(int value) {
        if (value == 1) {
            // Basis dari rekursi: faktorial dari 1 adalah 1.
            return 1;
        } else {
            // Rekursi: faktorial(value) = value * faktorial(value - 1).
            // Untuk menghitung faktorial dari angka value, kita mengalikan value dengan faktorial dari angka value - 1.
            // Proses ini dilakukan secara berulang hingga mencapai basis rekursi.
            return value * factorialRecursive(value - 1);
        }
    }

    public static void main(String[] args) {
        // Memanggil metode factorialRecursive dengan angka yang ingin dihitung faktorialnya
        int angka = 5; // Ubah angka sesuai dengan yang ingin Anda hitung faktorialnya.
        int hasil = factorialRecursive(angka);
        System.out.println("Hasil faktorial dari " + angka + " adalah " + hasil);
    }
}
