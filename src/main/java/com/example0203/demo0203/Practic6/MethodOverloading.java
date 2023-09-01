package com.example0203.demo0203.Practic6;

public class MethodOverloading {

    public static void main(String[] args) {
        sayHello("Aldi", "Septiyanto");
    }

    /**
     * Metode ini mencetak pesan salam sederhana "Hello".
     */
    static void sayHello() {
        System.out.println("Hello");
    }

    /**
     * Metode ini mencetak pesan salam dengan menambahkan nama depan yang diberikan.
     *
     * @param firstName Nama depan yang akan digunakan dalam pesan salam.
     */
    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    /**
     * Metode ini mencetak pesan salam dengan menggabungkan nama depan dan nama belakang yang diberikan.
     *
     * @param firstName Nama depan yang akan digunakan dalam pesan salam.
     * @param lastName  Nama belakang yang akan digunakan dalam pesan salam.
     */
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
