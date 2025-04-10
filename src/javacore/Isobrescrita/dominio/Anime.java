package javacore.Isobrescrita.dominio;

public class Anime {
    private String anime;

    @Override
    public String toString() {
        return "Anime{" +
                "anime='" + anime + '\'' +
                '}';
    }

    public Anime(String anime) {
        this.anime = anime;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }
}
