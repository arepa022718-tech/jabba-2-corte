package app.farmacia;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroMedicamentos {

    private Set<String> inventario = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {

        int op;

        do {
            System.out.println("\n--- FARMACIA ---");
            System.out.println("1. Registrar");
            System.out.println("2. Consultar");
            System.out.println("3. Listar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> registrar();
                case 2 -> consultar();
                case 3 -> listar();
                case 4 -> eliminar();
            }

        } while (op != 5);
    }

    private void registrar() {
        System.out.print("Nombre: ");
        String med = sc.nextLine().toLowerCase();

        if (inventario.add(med)) {
            System.out.println("Registrado");
        } else {
            System.out.println("Ya existe");
        }
    }

    private void consultar() {
        System.out.print("Buscar: ");
        String med = sc.nextLine().toLowerCase();

        System.out.println(inventario.contains(med) ? "Disponible" : "No está");
    }

    private void listar() {
        inventario.forEach(System.out::println);
    }

    private void eliminar() {
        System.out.print("Eliminar: ");
        String med = sc.nextLine().toLowerCase();

        System.out.println(inventario.remove(med) ? "Eliminado" : "No existe");
    }
}