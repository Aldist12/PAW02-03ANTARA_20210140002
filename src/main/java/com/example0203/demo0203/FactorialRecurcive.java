package com.example0203.demo0203;

public class FactorialRecurcive {
    static int factorialecurcive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialecurcive(value - 1);
        }
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorialecurcive(number);
        System.out.println(number + " Factorial =" + result);

        int datainput = 5, hasildata;
        hasildata = factorialecurcive(datainput);
        System.out.println(datainput + " FactorialRec. nya =" + hasildata);
    }
}
