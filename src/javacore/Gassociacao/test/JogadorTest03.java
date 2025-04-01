package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---- Jogador -----");

        jogador.imprime();

        System.out.println("---- Jogador 2");

        jogador2.setTime(time);
        jogador2.imprime();


        System.out.println("---- Time ----");

        time.imprime();
    }
}
