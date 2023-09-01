package com.example0203.demo0203.Practic6;

public class Scope {
    
    public static void main(String[] args) {
        // Memanggil metode sayHello dengan nama yang ingin disapa
        sayHello("Aldist"); 
    }
    /**
     * Metode ini menyapa seseorang dengan nama yang diberikan.
     *
     * @param name Nama yang akan disapa.
     */
    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            // String hi = "Hi " + name; // Kode ini akan menghasilkan error jika diaktifkan
            System.out.println(hello); // Menggunakan variabel 'hello' yang telah dideklarasikan sebelumnya
        }
    }
}

