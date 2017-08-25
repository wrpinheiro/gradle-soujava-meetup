package org.soujava.gradle.springbootexample.service;

import org.junit.Test;
import org.junit.Assert;

public class CalculadoraTest {
    @Test
    public void must_return_7_as_the_sum_of_5_and_2() {
        Calculadora c = new Calculadora();

        int soma = c.somar(5, 2);
        Assert.assertEquals(7, soma);
    }

    @Test
    public void must_return_15_as_difference_of_21_and_6() {
        Calculadora c = new Calculadora();

        int diferenca = c.subtrair(21, 6);
        Assert.assertEquals(15, diferenca);
    }
}
