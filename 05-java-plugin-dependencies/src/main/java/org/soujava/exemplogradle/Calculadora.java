package org.soujava.exemplogradle;

import java.util.Arrays;

import org.apache.commons.lang3.math.NumberUtils;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int max(int ... operandos) {
        return NumberUtils.max(operandos);
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        int soma = c.somar(5, 3);

        int max = c.max(10, -2, 3, 43, -5);

        System.out.println(soma);
        System.out.println(max);
    }
}
