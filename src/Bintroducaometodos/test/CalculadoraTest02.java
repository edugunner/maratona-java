package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 70);
        System.out.println("---------------");
        double result = calculadora.divideDoisNumeros(8,6);
        System.out.println(result);
        System.out.println("-------------------");
        calculadora.imprimeDivisaoDoisNumeros(76,3);
    }
}

