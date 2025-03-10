package estudos.devDojo.ytb.sintaxeJava;

public class Aula04EstruturasDeRepetiçãoExercicio {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 1000000
        for (int i = 0; i <= 100000; i ++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}