package javacore.Npolimofismo.test;

import javacore.Npolimofismo.dominio.Computador;
import javacore.Npolimofismo.dominio.Tomate;
import javacore.Npolimofismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ACER NITRO", 7500);
        Tomate tomate = new Tomate("Tomate", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
