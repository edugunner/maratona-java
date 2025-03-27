package Dconstrutores.test;


import Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 924, "Ação");
        Anime anime02 = new Anime();
        anime.imprime();
        anime02.imprime();
    }
}
