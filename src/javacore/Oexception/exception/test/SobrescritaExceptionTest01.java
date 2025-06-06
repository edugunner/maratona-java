package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.Funcionario;
import javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
