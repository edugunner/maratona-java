package javacore.Npolimofismo.test;

import javacore.Npolimofismo.dominio.Computador;
import javacore.Npolimofismo.dominio.Produto;
import javacore.Npolimofismo.dominio.Tomate;
import javacore.Npolimofismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("PC KABUM", 4000);

        Tomate tomate = new Tomate("Alemão", 26);
        tomate.setDataValidade("12/12/2025");

        CalculadoraImposto.calcularImposto(tomate);

    }
}
