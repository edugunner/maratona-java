package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Comprador;
import javacore.Jmodificadorfinal.dominio.Subaru;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Camaro");
        System.out.println(carro.COMPRADOR);
        Subaru subaru = new Subaru();
        subaru.COMPRADOR.setNome("Impreza");
        System.out.println(subaru.COMPRADOR);
    }
}
