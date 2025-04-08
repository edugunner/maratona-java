package javacore.GassociacaoExercicio.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private String seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, String seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("Aluno");
        System.out.println(nome);
        System.out.println(idade);
        if (seminario != null) {
            System.out.println(seminario);
        } else {
            System.out.println("Aluno não tem um seminario atribuido");
        }
        System.out.println("--------");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSeminario() {
        return seminario;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
