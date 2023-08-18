package com.example0203.demo0203;

public class DenganVariableArgument {
    static void sayCongrats(String name, int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat" + name ", Anda Lulus");
        }
    }
}
