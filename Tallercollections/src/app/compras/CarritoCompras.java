package app.compras;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CarritoCompras {

    private List<Item> lista = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);

    public void ejecutar() {

        int opcion;

        while (true) {
            System.out.println("\n--- MENÚ COMPRAS ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Quitar producto");
            System.out.println("3. Ver lista");
            System.out.println("4. Ver total");
            System.out.println("5. Salir");
            System.out.print("Elegir: ");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 5) break;

            switch (opcion) {
                case 1 -> añadir();
                case 2 -> quitar();
                case 3 -> listar();
                case 4 -> total();
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private void añadir() {
        System.out.print("Producto: ");
        String nombre = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        lista.add(new Item(nombre, precio));
        System.out.println("Añadido.");
    }

    private void quitar() {
        System.out.print("Producto a quitar: ");
        String nombre = sc.nextLine();

        boolean ok = lista.removeIf(i ->
                i.getDescripcion().equalsIgnoreCase(nombre));

        System.out.println(ok ? "Eliminado" : "No encontrado");
    }

    private void listar() {
        lista.forEach(System.out::println);
    }

    private void total() {
        double suma = 0;
        for (Item i : lista) {
            suma += i.getValor();
        }
        System.out.println("Total: $" + suma);
    }
}