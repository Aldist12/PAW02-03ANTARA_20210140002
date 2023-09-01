package com.example0203.demo0203.Practic6;

public class FactorialLoop {
    /**
     * Menghitung faktorial dari suatu angka menggunakan perulangan.
     *
     * @param value Angka untuk menghitung faktorialnya.
     * @return Nilai faktorial dari angka tersebut.
     */
    static int factorial(int value) {
        var result = 1; // Inisialisasi hasil faktorial dengan 1.

        // Perulangan untuk mengalikan nilai-nilai dari 1 hingga value.
        for (int i = 1; i <= value; i++) {
            result *= i; // Mengalikan result dengan nilai i.
        }

        return result; // Mengembalikan hasil faktorial.
    }

    public static void main(String[] args) {
        int angka = 7; // Ubah angka sesuai dengan yang ingin Anda hitung faktorialnya.
        int hasil = factorial(angka);
        System.out.println("Hasil faktorial dari " + angka + " adalah " + hasil);
    }
}
