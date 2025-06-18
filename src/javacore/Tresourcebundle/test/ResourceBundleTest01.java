package javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));
        //Locale("fr", "CA")
        //messages_fr_CA.properties 1° Tentativa
        //messages_fr.properties 2° Tentativa
        //messages_en_US.properties 3° Tentativa
        //messages_en.properties 4° Tentativa
        //messages.properties 5° Tentativa
        System.out.println(bundle.getString("hi"));
    }
}
