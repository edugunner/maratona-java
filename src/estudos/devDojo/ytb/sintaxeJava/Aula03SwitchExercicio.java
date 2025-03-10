package estudos.devDojo.ytb.sintaxeJava;

public class Aula03SwitchExercicio {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        //Considerando 1 como domingo
        int day = 4;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
