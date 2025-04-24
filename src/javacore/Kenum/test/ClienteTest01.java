package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO );
        Cliente cliente2 = new Cliente("Jarbas", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO );
        Cliente cliente3 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO );
        Cliente cliente4 = new Cliente("Fabio", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
