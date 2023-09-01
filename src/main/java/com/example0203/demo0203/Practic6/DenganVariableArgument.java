package com.example0203.demo0203.Practic6;

public class DenganVariableArgument {
    public static void main(String[] args) {
        int[] scoresAldist = { 80, 85, 90 };
        int[] scoresFandi = { 70, 65, 80 };

        sayCongrats("Aldist", scoresAldist);
        sayCongrats("Fandi", scoresFandi);
    }
    /**
     * Metode ini memberikan ucapan selamat atau tidak lulus kepada seseorang berdasarkan nilai-nilai yang diberikan.
     *
     * @param name   Nama orang yang akan menerima ucapan.
     * @param values Nilai-nilai yang akan dinilai.
     */
    static void sayCongrats(String name, int... values) {
        int total = 0;

        // Menghitung total nilai dari variabel-variabel int yang diberikan.
        for (var value : values) {
            total += value;
        }

        // Menghitung nilai rata-rata.
        int finalValue = total / values.length;

        // Memberikan ucapan berdasarkan nilai rata-rata.
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
