package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    // \d = Todos os dígitos
    // \D = Tudo o que não for digito
    // \s = Todos os espaços em branco  \t \n \f \r
    // \S = Todos os caracteres excluindo os brancos
    // \w = a-ZA-Z, dígitos, _
    // \W = Tudo que não for incluso no \w
    public static void main(String[] args) {


        String regex = "\\W";
        String texto = "abaaba";
        String texto2 = "h2132_!1h23duj";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println(("texto:     " +texto));
        System.out.println(("indice: 0123456789"));
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
    }
}
