package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest06 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.numPrimo(85);
        System.out.println(calculadora.numPrimo(80));
    }
}
