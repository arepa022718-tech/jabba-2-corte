package academicoApp.core;

public class Profesor extends UsuarioBase {

    private String area;

    public Profesor(String nombreCompleto, String area) {
        super(nombreCompleto);
        this.area = area;
    }

    public String verArea() {
        return area;
    }
}