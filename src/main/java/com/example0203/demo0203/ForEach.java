package com.example0203.demo0203;

public class ForEach {
    public static void main(String [] args) {
        String[] array = {
            "Eko", "Kurniawan", "Khannedy",
            "Programmer", "Zaman", "Now"
        };

        for(var value : array) {
            System.out.println(value);
        }

    }
}
