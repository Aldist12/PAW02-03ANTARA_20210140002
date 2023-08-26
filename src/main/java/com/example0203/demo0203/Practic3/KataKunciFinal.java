package com.example0203.demo0203.Practic3;

public class KataKunciFinal {
    public static void main(String[] args) {
        final String name = "Eko Kurniawan Khannedy";
        var age = 30;
        var address = "Indonesia";

        // Menghapus baris berikut karena variabel final tidak dapat diubah
        // name = "Nama Diubah";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
