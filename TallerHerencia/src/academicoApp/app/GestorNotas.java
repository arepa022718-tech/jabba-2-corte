package academicoApp.app;

import academicoApp.core.*;
import java.util.Scanner;

public class GestorNotas {

    private Scanner input = new Scanner(System.in);

    public void ejecutar() {

        System.out.print("Alumno: ");
        Alumno alumno = new Alumno(input.nextLine());

        System.out.print("Profesor: ");
        String prof = input.nextLine();

        System.out.print("Área: ");
        Profesor profesor = new Profesor(prof, input.nextLine());

        System.out.print("Curso: ");
        Curso curso = new Curso(input.nextLine(), profesor);

        cargarNotas(alumno);
        imprimir(alumno, curso);
    }

    private void cargarNotas(Alumno alumno) {

        System.out.print("¿Cuántas notas?: ");
        int cantidad = input.nextInt();

        int i = 1;
        while (i <= cantidad) {
            System.out.print("Nota " + i + ": ");
            alumno.registrarNota(input.nextDouble());
            i++;
        }
    }

    private void imprimir(Alumno a, Curso c) {

        System.out.println("\n=== REPORTE ===");
        System.out.println("Alumno: " + a.verNombre());
        System.out.println("Curso: " + c.verTitulo());
        System.out.println("Profesor: " + c.getEncargado().verNombre());
        System.out.println("Promedio final: " + a.promedioFinal());
    }
}