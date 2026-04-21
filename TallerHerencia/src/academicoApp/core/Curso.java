package academicoApp.core;

public class Curso {

    private String titulo;
    private Profesor encargado;

    public Curso(String titulo, Profesor encargado) {
        this.titulo = titulo;
        this.encargado = encargado;
    }

    public String verTitulo() {
        return titulo;
    }

    public Profesor getEncargado() {
        return encargado;
    }
}