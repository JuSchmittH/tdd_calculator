package com.tdd_discount_sales.tdd_discount_sales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void calculaSomaEntreDoisNumeros(){
        int numeroUm = 2;
        int numeroDois = 1;

        int resultado = calculadora.soma(numeroUm, numeroDois);

        assertEquals(3, resultado);
    }
}