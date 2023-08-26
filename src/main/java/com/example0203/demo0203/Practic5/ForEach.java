package com.example0203.demo0203.Practic5;

public class ForEach {  // Deklarasi class "ForEach"
    public static void main(String[] args) {  // Metode utama (main)
        String[] array = {  // Deklarasi dan inisialisasi array "array"
            "Eko", "Kurniawan", "Khannedy",
            "Programmer", "Zaman", "Now"
        };

        for (var value : array) {  // Melakukan perulangan for-each untuk setiap nilai dalam array
            System.out.println(value);  // Mencetak nilai saat ini dari array
        }
    }
}
