package javacore.Npolimofismo.service;

import javacore.Npolimofismo.repositorio.Repositorio;

public class RepositorioBancoMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
