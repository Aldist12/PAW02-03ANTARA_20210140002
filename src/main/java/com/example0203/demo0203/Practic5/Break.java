package com.example0203.demo0203.Practic5;

public class Break {  // Deklarasi class "Break"
    public static void main(String[] args) {  // Metode utama (main)
        var counter = 1;  // Deklarasi dan inisialisasi variabel counter dengan nilai 1
        
        while (true) {  // Memulai perulangan yang selalu benar (tidak memiliki kondisi berhenti)
            System.out.println("Perulangan Ke-" + counter);  // Cetak pesan perulangan dengan nomor iterasi
            counter++;  // Tambahkan 1 ke nilai counter
            
            if (counter > 10) {  // Pemeriksaan apakah counter melebihi 10
                break;  // Jika iya, hentikan perulangan dengan pernyataan "break"
            }
        }
    }
}
