package academicoApp.core;

import java.util.LinkedList;

public class Alumno extends UsuarioBase {

    private LinkedList<Double> calificaciones;

    public Alumno(String nombreCompleto) {
        super(nombreCompleto);
        calificaciones = new LinkedList<>();
    }

    public void registrarNota(double nota) {
        calificaciones.add(nota);
    }

    public double promedioFinal() {
        double suma = 0;

        for (double n : calificaciones) {
            suma += n;
        }

        return calificaciones.isEmpty() ? 0 : suma / calificaciones.size();
    }
}