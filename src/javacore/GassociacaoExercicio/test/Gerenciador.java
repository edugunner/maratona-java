package javacore.GassociacaoExercicio.test;

import javacore.GassociacaoExercicio.dominio.Aluno;
import javacore.GassociacaoExercicio.dominio.Local;
import javacore.GassociacaoExercicio.dominio.Professor;
import javacore.GassociacaoExercicio.dominio.Seminario;

public class Gerenciador {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 16);
        Aluno aluno2 = new Aluno("Augusto", 15);
        Aluno[] grupo1 = {aluno1,aluno2};

        Aluno aluno3 = new Aluno("Guilherme", 14);
        Aluno aluno4 = new Aluno("Joana", 13);
        Aluno[] grupo2 = {aluno3,aluno4};

        Aluno aluno5 = new Aluno("Roberto", 18);

        Professor professor = new Professor("Alberto", "Geografia");


        Local local = new Local("Sala 15");
        Local local1 = new Local("Sala 16");

        Seminario seminario1 = new Seminario("Pedras e rochas", local1.getLocal());
        Seminario seminario2 = new Seminario("Magma", local.getLocal());
        Seminario seminario3 = new Seminario("Pedras Preciosas", local1.getLocal());

        Seminario[] seminarios = {seminario1, seminario2, seminario3};

        seminario1.setAlunos(grupo1);
        seminario2.setAlunos(grupo2);
        aluno1.setSeminario(seminario1.getTitulo());
        aluno2.setSeminario(seminario1.getTitulo());
        aluno3.setSeminario(seminario2.getTitulo());
        aluno4.setSeminario(seminario2.getTitulo());

        professor.setSeminarios(seminarios);

        professor.imprime();

        seminario1.imprime();
        seminario2.imprime();
        seminario3.imprime();

        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();
        aluno4.imprime();
        aluno5.imprime();


    }
}
