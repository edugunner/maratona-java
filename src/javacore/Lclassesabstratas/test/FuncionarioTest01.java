package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Funcionario;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Julia", 7000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Marcos", 5000);
        System.out.println(desenvolvedor);
    }
}
