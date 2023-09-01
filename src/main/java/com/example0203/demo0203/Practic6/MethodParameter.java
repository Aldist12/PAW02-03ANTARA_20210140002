package com.example0203.demo0203.Practic6;

public class MethodParameter {
    /**
     * Metode utama yang menjalankan program.
     *
     * @param args Argumen yang diteruskan ke program (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        sayHello("Aldi", "Septiyanto");
    }

    /**
     * Metode ini mencetak pesan salam dengan menggabungkan nama depan dan nama belakang.
     *
     * @param firstName Nama depan yang akan digunakan dalam pesan salam.
     * @param lastName  Nama belakang yang akan digunakan dalam pesan salam.
     */
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
