package javacore.Npolimofismo.service;

import javacore.Npolimofismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
