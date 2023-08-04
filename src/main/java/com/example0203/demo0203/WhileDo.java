package com.example0203.demo0203;

public class WhileDo {
    public static void main(String [] args) {
        var counter = 100;

        do {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        }   while (counter <= 10);
    }
}
