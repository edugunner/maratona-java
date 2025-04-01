package javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDadosTeclado02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("O grandioso software que prevê o futuro");
        System.out.println("Digite sua pergunta e eu responderei com Sim ou Não");
        String pergunta = entrada.nextLine();
        if(pergunta.charAt(0) == ' ') {
            System.out.println("NÃO");
        } else {
            System.out.println("SIM ");
        }
    }
}
