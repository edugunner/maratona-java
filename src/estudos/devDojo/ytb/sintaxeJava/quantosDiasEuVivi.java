package estudos.devDojo.ytb.sintaxeJava;

public class quantosDiasEuVivi {
    public static void main(String[] args) {
        //Dias Vividos
        int anos = 19;
        int diasNoAno = 365;
        double diasVivo = anos * diasNoAno;

        //Horas Vividas
        // dias vividos * 24
        int horasDoDia = 24;
        double horasVivo = horasDoDia * diasVivo;

        //Minutos Vividos
        int minutosHora = 60;
        int minutosDia = minutosHora * 24;
        double minutosVivo = minutosDia * diasVivo;
        System.out.println( "Estou vivo a " + diasVivo + " dias, " + horasVivo + " horas e " + minutosVivo + " minutos. " );
    }
}
