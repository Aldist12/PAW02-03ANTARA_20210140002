package com.example0203.demo0203.Practic5;

public class ForLoop_DenganInitStatement {  // Deklarasi class "ForLoop_DenganInitStatement"
    public static void main(String[] args) {  // Metode utama (main)
        for (var counter = 1; counter <= 10; ) {  // Memulai perulangan dengan inisialisasi variabel counter, tanpa pernyataan iterasi
            System.out.println("Perulangan ke-" + counter);  // Cetak pesan perulangan dengan nomor iterasi
            counter++;  // Tambahkan 1 ke nilai counter
        }
    }
}
