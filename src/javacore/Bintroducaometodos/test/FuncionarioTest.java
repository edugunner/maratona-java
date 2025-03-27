package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Eduardo");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{1347,1294.34,1702.36});

        funcionario.Imprime();
        System.out.println("Média " + funcionario.getMedia());
    }
}
