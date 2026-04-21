package app.compras;

public class Item {

    private String descripcion;
    private double valor;

    public Item(String descripcion, double valor) {
        this.descripcion = descripcion.trim();
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descripcion + " ($" + valor + ")";
    }
}