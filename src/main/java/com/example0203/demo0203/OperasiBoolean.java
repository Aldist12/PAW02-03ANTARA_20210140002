package com.example0203.demo0203;

public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75; 
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
