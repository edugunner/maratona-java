package Bintroducaometodos.dominio;

public class ImprimeEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.curso);
        System.out.println("----------");
    }
}
