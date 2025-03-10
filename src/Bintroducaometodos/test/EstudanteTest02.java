package Bintroducaometodos.test;

import Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante imprime = new Estudante();


        estudante01.nome = "Hachico";
        estudante01.sexo = 'M';
        estudante01.idade = 10;
        estudante01.curso = "TI";

        estudante02.nome = "Lola";
        estudante02.sexo = 'F';
        estudante02.idade = 11;
        estudante02.curso = "Marcenaria";

        estudante01.imprime();
        estudante02.imprime();


    }
}
