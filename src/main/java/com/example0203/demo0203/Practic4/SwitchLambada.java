package com.example0203.demo0203.Practic4;

public class SwitchLambada {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }
    }
}
