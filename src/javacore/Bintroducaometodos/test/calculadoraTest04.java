package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class calculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 3;
        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Dentro do calculadoraTest04");
        System.out.println("num1 "+a);
        System.out.println("num2 "+b);

    }
}
