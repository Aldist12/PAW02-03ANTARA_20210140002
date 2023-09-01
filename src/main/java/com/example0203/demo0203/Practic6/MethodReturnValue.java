package com.example0203.demo0203.Practic6;

public class MethodReturnValue {
    /**
     * Metode utama yang menjalankan program.
     *
     * @param args Argumen yang diteruskan ke program (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println(c);
    }

    /**
     * Metode ini menghitung jumlah dua bilangan bulat dan mengembalikan hasilnya.
     *
     * @param value1 Bilangan bulat pertama.
     * @param value2 Bilangan bulat kedua.
     * @return Jumlah dari value1 dan value2.
     */
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }
}
