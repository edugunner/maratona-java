package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando soma de dois numeros");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando subtração de dois numeros");
    }
}
