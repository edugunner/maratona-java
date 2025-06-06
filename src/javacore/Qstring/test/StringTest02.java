package javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Carlos";
        String numeros = "012345";
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.replace("a","s"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(4,numeros.length()));
        System.out.println(nome.trim());
    }
}
