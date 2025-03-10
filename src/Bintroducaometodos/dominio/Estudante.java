package Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    public String curso;

    public void imprime() {
        System.out.println("-------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.curso);
    }
}

