package estudos.devDojo.ytb.sintaxeJava;

public class exercicioIMC {
    public static void main(String[] args) {
        double peso = 145.7;
        double altura = 1.67;
        double imc = peso / (altura * 2);

        if (imc <= 18.5) {
            System.out.println("Seu imc é " + imc + " |Abaixo do peso");
        }
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu imc é " + imc + " |Peso ideal");
        }
        if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Seu imc é " + imc + " |Levemente acima do peso");
        }
        if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Seu imc é " + imc + " |Obesidade grau I ");
        }
        if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Seu imc é " + imc + " |Obesidade grau II (severa)");
        }
        if (imc >= 40.0) {
            System.out.println("Seu imc é " + imc + " |Obesidade grau III (mórbida) ");

        }
    }
}