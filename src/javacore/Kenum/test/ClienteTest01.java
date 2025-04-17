package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO );
        Cliente cliente2 = new Cliente("Jarbas", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO );
        Cliente cliente3 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO );
        Cliente cliente4 = new Cliente("Fabio", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
