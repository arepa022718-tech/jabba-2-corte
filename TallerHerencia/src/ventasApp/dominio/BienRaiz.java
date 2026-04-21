package ventasApp.dominio;

public class BienRaiz {

    private double costo;
    private Categoria categoria;

    public BienRaiz(double costo, Categoria categoria) {
        this.costo = costo;
        this.categoria = categoria;
    }

    public double getCosto() {
        return costo;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}