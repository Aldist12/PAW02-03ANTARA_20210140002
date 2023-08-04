package com.example0203.demo0203;

public class Continue {
    public static void main(String [] args) {
        
        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }

            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
}
