package com.example0203.demo0203.Practic5;

public class WhileDo {  // Deklarasi class "WhileDo"
    public static void main(String[] args) {  // Metode utama (main)
        var counter = 100;  // Inisialisasi variabel counter dengan nilai 100

        do {  // Mulai perulangan "do-while"
            System.out.println("Perulangan Ke-" + counter);  // Cetak pesan perulangan dengan nomor iterasi
            counter++;  // Tambahkan 1 ke nilai counter
        } while (counter <= 10);  // Perulangan akan berlanjut selama nilai counter kurang dari atau sama dengan 10
    }
}
