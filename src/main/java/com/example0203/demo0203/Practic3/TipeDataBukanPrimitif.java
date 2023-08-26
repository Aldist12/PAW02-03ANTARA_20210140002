package com.example0203.demo0203.Practic3;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // Tipe data bukan primitif
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort; // null
        iniShort = (short) 100; // Menggunakan pengecoran untuk mengubah tipe numerik menjadi Short

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniBoolean);
        System.out.println(iniShort);
    }
}
