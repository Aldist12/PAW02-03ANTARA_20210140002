package com.example0203.demo0203.Practic5;

public class Continue {  // Deklarasi class "Continue"
    public static void main(String[] args) {  // Metode utama (main)
        for (int counter = 1; counter <= 100; counter++) {  // Memulai perulangan dengan variabel counter dari 1 hingga 100
            if (counter % 2 == 0) {  // Pemeriksaan apakah nilai counter adalah bilangan genap
                continue;  // Jika iya, loncati iterasi saat ini menggunakan pernyataan "continue"
            }

            System.out.println("Perulangan Ganjil-" + counter);  // Cetak pesan perulangan untuk bilangan ganjil
        }
    }
}