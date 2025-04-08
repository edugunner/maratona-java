package javacore.GassociacaoExercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private String local;


    public Seminario(String titulo, String local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, String local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime() {

        System.out.println("Seminario");
        System.out.println(getTitulo());
        System.out.println(getLocal());
        if (alunos == null) {
            System.out.println("Não tem aluno atribuido a esse seminario");
            System.out.println("----------");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());

            }
        }
        System.out.println("-----------");

    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
