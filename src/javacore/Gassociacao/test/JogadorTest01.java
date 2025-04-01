package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Roberto Carlos");
        Jogador jogador2 = new Jogador("Kaká");
        Jogador jogador3 = new Jogador("Ronaldo");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
            
        }


    }
}
