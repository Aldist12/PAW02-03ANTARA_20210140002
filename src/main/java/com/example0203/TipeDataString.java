package com.example0203;

public class TipeDataString {
    public static void main(String[] args) {
        // Mendeklarasikan variabel dengan tipe data String
        String firstName = "Aldi";
        String lastName = "Septiyanto";

        // Menggabungkan dua string menggunakan operator +
        String fullName = firstName + " " + lastName;

        // Mendeklarasikan string dengan menggunakan konstruktor
        String address = new String("Krobokan tamanan banguntapan");

        // Mengakses karakter individu dalam string
        char firstChar = firstName.charAt(0); // Menghasilkan 'A'

        // Mengambil panjang string
        int fullNameLength = fullName.length(); // Menghasilkan 8 (spasi dihitung)

        // Membandingkan string
        String str1 = "hello";
        String str2 = "world";
        boolean isEqual = str1.equals(str2); // Menghasilkan false

        // Mengubah string menjadi huruf besar dan huruf kecil
        String uppercaseName = fullName.toUpperCase();
        String lowercaseName = fullName.toLowerCase();

        // Mengecek apakah string berawalan atau berakhiran dengan substring tertentu
        boolean startsWithAldi = fullName.startsWith("Aldi"); // Menghasilkan true
        boolean endsWithSeptiyanto = fullName.endsWith("Septiyanto"); // Menghasilkan true

        // Mencari posisi substring dalam string
        int indexOfSeptiyanto = fullName.indexOf("Septiyanto"); // Menghasilkan 5

        // Mengganti substring dengan substring lain dalam string
        String replacedName = fullName.replace("Septiyanto", "Konah"); // Menghasilkan "Aldi Konah"

        // Memotong string menjadi substring baru
        String firstNameSubstring = fullName.substring(0, 4); // Menghasilkan "Aldi"
        String lastNameSubstring = fullName.substring(5); // Menghasilkan "Septiyanto"

        // Mengecek apakah string kosong atau tidak
        boolean isFullNameEmpty = fullName.isEmpty(); // Menghasilkan false

        // Menghapus spasi di awal dan akhir string
        String stringWithWhitespace = "   Hello World!   ";
        String trimmedString = stringWithWhitespace.trim(); // Menghasilkan "Hello World!"

        // Mencetak hasil
        System.out.println("Full Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("First Character: " + firstChar);
        System.out.println("Full Name Length: " + fullNameLength);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Uppercase Name: " + uppercaseName);
        System.out.println("Lowercase Name: " + lowercaseName);
        System.out.println("Starts with 'Aldi': " + startsWithAldi);
        System.out.println("Ends with 'Septiyanto': " + endsWithSeptiyanto);
        System.out.println("Index of 'Septiyanto': " + indexOfSeptiyanto);
        System.out.println("Replaced Name: " + replacedName);
        System.out.println("First Name Substring: " + firstNameSubstring);
        System.out.println("Last Name Substring: " + lastNameSubstring);
        System.out.println("Is Full Name Empty: " + isFullNameEmpty);
        System.out.println("Trimmed String: " + trimmedString);
    }
}

