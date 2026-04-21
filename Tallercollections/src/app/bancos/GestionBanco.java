package app.banco;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionBanco {

    private Map<String, ClienteCuenta> data = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void ejecutar() {

        int op;

        while (true) {
            System.out.println("\n--- BANCO ---");
            System.out.println("1. Nueva cuenta");
            System.out.println("2. Ver saldo");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Salir");

            op = sc.nextInt();
            sc.nextLine();

            if (op == 5) break;

            switch (op) {
                case 1 -> crear();
                case 2 -> ver();
                case 3 -> ingresar();
                case 4 -> retirar();
            }
        }
    }

    private void crear() {
        System.out.print("ID cuenta: ");
        String id = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double s = sc.nextDouble();
        sc.nextLine();

        data.put(id, new ClienteCuenta(s));
        System.out.println("Cuenta creada");
    }

    private void ver() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        ClienteCuenta c = data.get(id);
        System.out.println(c != null ? c.getSaldo() : "No existe");
    }

    private void ingresar() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Monto: ");
        double m = sc.nextDouble();
        sc.nextLine();

        if (data.containsKey(id)) {
            data.get(id).sumar(m);
            System.out.println("OK");
        }
    }

    private void retirar() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Monto: ");
        double m = sc.nextDouble();
        sc.nextLine();

        ClienteCuenta c = data.get(id);

        if (c != null && c.restar(m)) {
            System.out.println("Retiro OK");
        } else {
            System.out.println("No se pudo");
        }
    }
}