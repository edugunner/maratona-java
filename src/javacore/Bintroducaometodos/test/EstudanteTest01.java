package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();
        estudante01.nome = "Hachico";
        estudante01.sexo = 'M';
        estudante01.idade = 10;
        estudante01.curso = "TI";

        estudante02.nome = "Lola";
        estudante02.sexo = 'F';
        estudante02.idade = 11;
        estudante02.curso = "Marcenaria";

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
