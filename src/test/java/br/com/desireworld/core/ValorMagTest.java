package br.com.desireworld.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValorMagTest {
    ValorMag valor;

    @Before
    public void setUp() throws Exception {
        this.valor = new ValorMag();
    }

    @Test
    public void constructorEmpty(){
        assertEquals(0, this.valor.getMag());
        assertEquals(0, this.valor.getValor());
    }

    @Test
    public void constructorValorMag(){
        this.valor = new ValorMag(10, 4);
        assertEquals(10, this.valor.getValor());
        assertEquals(4, this.valor.getMag());
    }

    @Test
    public void constructorInteger(){
        this.valor = new ValorMag(12450);
        assertEquals(12, this.valor.getValor());
        assertEquals(5, this.valor.getMag());
    }

    @Test
    public void constructorLong(){
        this.valor = new ValorMag(9.5);
        assertEquals(95, this.valor.getValor());
        assertEquals(1, this.valor.getMag());
    }

    @Test
    public void getValor() {
        this.valor = new ValorMag(10, 5);
        assertEquals(10, valor.getValor());
    }

    @Test
    public void setValor() {
        this.valor.setValor(25);
        assertEquals(25, valor.getValor());
    }

    @Test
    public void getMag() {
        this.valor = new ValorMag(10,5);
        assertEquals(5, this.valor.getMag());
    }

    @Test
    public void setMag() {
        this.valor.setMag(15);
        assertEquals(15, this.valor.getMag());
    }

    @Test
    public void equals() {
        this.valor = new ValorMag(10, 5);
        ValorMag resultado = new ValorMag(10, 5);
        assertTrue(valor.equals(resultado));
    }

    @Test
    public void divide_valormag() {
        ValorMag resultado = new ValorMag(20, 2);
        this.valor = new ValorMag(10, 4);
        ValorMag divisor = new ValorMag(50, 2);
        assertEquals(resultado, this.valor.divide(divisor));
    }

    @Test
    public void divide_integer() {
        ValorMag resultado = new ValorMag(20, 2);
        this.valor = new ValorMag(10, 4);
        int divisor = 50;
        assertEquals(resultado, this.valor.divide(divisor));
    }

    @Test
    public void add() {
        this.valor = new ValorMag(10, 4);
        ValorMag valor2 = new ValorMag(25, 3);
        ValorMag resultado = new ValorMag(12, 4);
        assertEquals(resultado, this.valor.add(valor2));
    }

    @Test
    public void subtract() {
        this.valor = new ValorMag(95, 4);
        ValorMag valor2 = new ValorMag(50, 4);
        ValorMag resultado = new ValorMag(45, 4);
        assertEquals(resultado, this.valor.subtract(valor2));
    }

    @Test
    public void toInteger() {
        this.valor = new ValorMag (46, 3);
        assertEquals(460, this.valor.toInteger());
    }

    @Test
    public void multiply_valorMag() {
        this.valor = new ValorMag(10, 3);
        ValorMag valor2 = new ValorMag(10, 2);
        ValorMag resultado = new ValorMag(10, 4);
        assertEquals(resultado, this.valor.multiply(valor2));
    }

    @Test
    public void multiply_integer() {
        this.valor = new ValorMag(10, 3);
        ValorMag resultado = new ValorMag(10, 4);
        assertEquals(resultado, this.valor.multiply(10));
    }
}