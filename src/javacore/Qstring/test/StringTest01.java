package javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "João"; // String constant pool
        String nome2 = "João";
        nome = nome.concat(" Vargas");
        System.out.println(nome);
        System.out.println(nome == nome2);// false por conta da linha 7
        String nome3 = new String("João");
        System.out.println(nome2 == nome3); //false
        System.out.println(nome2 == nome3.intern()); //true
    }
}
