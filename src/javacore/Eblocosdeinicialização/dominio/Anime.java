package javacore.Eblocosdeinicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //1 - Alocado espaço em memória
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passdo
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    public Anime(String nome) {
        this.nome = nome;
    }

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {

        for(int episodios: this.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}