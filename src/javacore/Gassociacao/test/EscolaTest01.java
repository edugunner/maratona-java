package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi");
        Professor professor2 = new Professor("Asuma");
        Professor professor3 = new Professor("Sarutobi");
        Professor[] professores = {professor1,professor2, professor3};
        Escola escola = new Escola("João Batista", professores);

        escola.imprime();

    }
}
