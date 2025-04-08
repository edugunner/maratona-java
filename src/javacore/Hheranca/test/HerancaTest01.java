package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 35");
        endereco.setCep("08510-532");

        Pessoa pessoa = new Pessoa("Roberto");
        pessoa.setCpf("108.456.789.02");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Carlos");
        funcionario.setCpf("232.213.442.23");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(21890);
        funcionario.imprime();

    }
}
