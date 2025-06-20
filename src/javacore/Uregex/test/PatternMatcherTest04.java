package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    // \d = Todos os dígitos
    // \D = Tudo o que não for digito
    // \s = Todos os espaços em branco  \t \n \f \r
    // \S = Todos os caracteres excluindo os brancos
    // \w = a-ZA-Z, dígitos, _
    // \W = Tudo que não for incluso no \w
    // []
    // ? Zero ou uma
    // * Zero ou mais
    // + uma ou mais
    // {n,m} de n até m
    // ()
    // | o(v|c)o ovo | oco
    // $

    public static void main(String[] args) {
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println(("texto:     " +texto));
        System.out.println(("indice: 0123456789"));
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
    }
}
