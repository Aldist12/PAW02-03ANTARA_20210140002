package com.example0203.demo0203.Practic5;

public class ForLoop_DenganKondisi {  // Deklarasi class "ForLoop_DenganKondisi"
    public static void main(String[] args) {  // Metode utama (main)
        var counter = 1;

        for (; counter <= 10; ) {  // Memulai perulangan dengan kondisi, tanpa inisialisasi atau pernyataan iterasi
            System.out.println("Perulangan ke-" + counter);  // Cetak pesan perulangan dengan nomor iterasi
            counter++;  // Tambahkan 1 ke nilai counter
        }
    }
}
