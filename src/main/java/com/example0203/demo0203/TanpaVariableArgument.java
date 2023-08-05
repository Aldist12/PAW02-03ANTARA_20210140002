package com.example0203.demo0203;

public class TanpaVariableArgument {
    static void sayCongrats(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("maaf " + name + ", Anda Tidak Lulus");
        }
    }

    public static void main(String[] args) {
        int[] scoresJohn = { 80, 85, 90 };
        int[] scoresJane = { 70, 65, 80 };

        sayCongrats("Aldist", scoresJohn);
        sayCongrats("Fandi", scoresJane);
    }
}
