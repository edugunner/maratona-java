package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 924);
        anime.init("Naruto", "TV", 924, "Ação");
        anime.imprime();
    }
}
