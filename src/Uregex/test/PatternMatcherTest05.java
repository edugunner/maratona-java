package Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
    // . 1.3 = 123, 133, 1@3, 1A3

    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email válido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println((texto.split(",")[1].trim()));
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
