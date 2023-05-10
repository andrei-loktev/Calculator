package com.example.calculator.service;

@org.springframework.stereotype.Service

public class Service {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}
