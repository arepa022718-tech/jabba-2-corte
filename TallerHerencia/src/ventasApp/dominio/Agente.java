package ventasApp.dominio;

import java.util.Vector;

public class Agente {

    private String nombre;
    private Vector<BienRaiz> historial;

    public Agente(String nombre) {
        this.nombre = nombre;
        historial = new Vector<>();
    }

    public void sumarVenta(BienRaiz b) {
        historial.add(b);
    }

    public Vector<BienRaiz> getHistorial() {
        return historial;
    }

    public String getNombre() {
        return nombre;
    }
}