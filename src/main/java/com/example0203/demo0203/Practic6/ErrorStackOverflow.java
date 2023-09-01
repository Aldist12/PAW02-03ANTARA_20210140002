package com.example0203.demo0203.Practic6;

public class ErrorStackOverflow {
    /**
     * Metode rekursif yang memunculkan kesalahan "Stack Overflow".
     *
     * @param value Nilai yang akan berkurang hingga mencapai 0.
     */
    static void loop(int value) {
        if (value == 0)  {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value - 1); // Memanggil dirinya sendiri dengan nilai yang berkurang.
        }
    }

    public static void main(String[] args) {
        // Memanggil metode loop dengan nilai yang ingin Anda gunakan.
        int nilai = 10; // Ubah nilai sesuai dengan yang Anda inginkan.
        loop(nilai);
    }
}
