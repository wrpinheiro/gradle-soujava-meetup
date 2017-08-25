package org.soujava.gradle.springbootexample;

import java.util.Arrays;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        int soma = c.somar(5, 3);

        System.out.println(soma);
    }
}
