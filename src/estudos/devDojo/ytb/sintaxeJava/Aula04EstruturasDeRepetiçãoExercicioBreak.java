package estudos.devDojo.ytb.sintaxeJava;

public class Aula04EstruturasDeRepetiçãoExercicioBreak {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 40000;
        for (int parcelas = 1; parcelas <= 1000; parcelas++) {
            double valorParcela = valorTotal / parcelas;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcelas + " R$ " + valorParcela);
            } else {
                break;
            }
        }
    }
}
