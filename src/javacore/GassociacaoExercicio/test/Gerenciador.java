package javacore.GassociacaoExercicio.test;

import javacore.GassociacaoExercicio.dominio.Aluno;
import javacore.GassociacaoExercicio.dominio.Local;
import javacore.GassociacaoExercicio.dominio.Professor;
import javacore.GassociacaoExercicio.dominio.Seminario;

import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        System.out.println("----GRUPO 1----");
        System.out.print("Insira o nome do Aluno: ");
        String nome = sc.nextLine();

        System.out.print("Insira a idade do Aluno: ");
        int idade = sc.nextInt();



        System.out.print("Insira o nome do Aluno: ");
        String nome2 = sc.next();


        System.out.print("Insira a idade do Aluno: ");
        int idade2 = sc.nextInt();

        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno2.setNome(nome2);
        aluno2.setIdade(idade2);



        Aluno[] grupo1 = {aluno1,aluno2};

        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();

        System.out.println("----GRUPO 2----");
        System.out.print("Insira o nome do Aluno: ");
        String nome3 = sc.next();

        System.out.print("Insira a idade do Aluno: ");
        int idade3 = sc.nextInt();

        aluno3.setNome(nome3);
        aluno3.setIdade(idade3);

        System.out.print("Insira o nome do Aluno: ");
        String nome4 = sc.next();

        System.out.print("Insira a idade do Aluno: ");
        int idade4 = sc.nextInt();

        aluno4.setNome(nome4);
        aluno4.setIdade(idade4);

        Aluno[] grupo2 = {aluno3,aluno4};


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





    }
}
