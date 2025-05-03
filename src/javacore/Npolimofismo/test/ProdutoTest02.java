package javacore.Npolimofismo.test;

import javacore.Npolimofismo.dominio.Computador;
import javacore.Npolimofismo.dominio.Produto;
import javacore.Npolimofismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("PC KABUM", 4000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");

        Produto produto2 = new Tomate("Alemão", 26);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("----------------");
    }
}
