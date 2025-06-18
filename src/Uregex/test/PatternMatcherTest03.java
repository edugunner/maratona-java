package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    // \d = Todos os dígitos
    // \D = Tudo o que não for digito
    // \s = Todos os espaços em branco  \t \n \f \r
    // \S = Todos os caracteres excluindo os brancos
    // \w = a-ZA-Z, dígitos, _
    // \W = Tudo que não for incluso no \w
    // []
    public static void main(String[] args) {

        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println(("texto:     " +texto2));
        System.out.println(("indice: 0123456789"));
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}
