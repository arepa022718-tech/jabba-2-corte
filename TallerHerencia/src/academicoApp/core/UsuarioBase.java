package academicoApp.core;

public class UsuarioBase {

    protected String nombreCompleto;

    public UsuarioBase(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String verNombre() {
        return nombreCompleto;
    }
}