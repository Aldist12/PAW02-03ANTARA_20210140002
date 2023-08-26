package com.example0203.demo0203.Practic5;

public class WhileLoop {  // Deklarasi class "WhileLoop"
    public static void main(String[] args) {  // Metode utama (main)
        var counter = 1;  // Inisialisasi variabel counter dengan nilai 1

        while (counter <= 10) {  // Memulai perulangan "while"
            System.out.println("Perulangan Ke-" + counter);  // Cetak pesan perulangan dengan nomor iterasi
            counter++;  // Tambahkan 1 ke nilai counter
        }
    }
}
