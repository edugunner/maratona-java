package javacore.Npolimofismo.test;

import javacore.Npolimofismo.repositorio.Repositorio;
import javacore.Npolimofismo.service.RepositorioArquivo;
import javacore.Npolimofismo.service.RepositorioBancoDeDados;

public class ProdutoTest04 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
