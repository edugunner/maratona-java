package introducaoPOO.dominio.exercicioPOO.teste;

import introducaoPOO.dominio.exercicioPOO.carros.carroInterface;

public class carroTeste {
    public static void main(String[] args) {
        carroInterface carro01 = new carroInterface();
        carroInterface carro02 = new carroInterface();

        carro01.nomeMarca = "Volkswagen";
        carro01.nomeModelo = "Fox";
        carro01.anoCarro = 2015;

        carro02.nomeMarca = "Ford";
        carro02.nomeModelo = "Fusion";
        carro02.anoCarro = 2014;

        System.out.println(carro01.nomeMarca + " " + carro01.nomeModelo + " " + carro01.anoCarro);
        System.out.println("---------------------------------------------");
        System.out.println(carro02.nomeMarca + " " + carro02.nomeModelo + " " + carro02.anoCarro);
    }
}
