package com.example0203.demo0203;

public class FactorialLoop {
    static int factorial(int value) {
        var result = 1;
        for (int i = 1; 1 <= value; i++) {
            result *= i;
        }
        return result;
    }
}

