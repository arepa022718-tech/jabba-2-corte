package ventasApp.motor;

import ventasApp.dominio.*;
import java.util.Scanner;

public class FlujoVentas {

    private Scanner sc = new Scanner(System.in);

    public Agente iniciarProceso() {

        System.out.print("Nombre agente: ");
        Agente ag = new Agente(sc.nextLine());

        System.out.print("Ventas realizadas: ");
        int total = sc.nextInt();

        for (int i = 0; i < total; i++) {

            System.out.println("\nTipo (1 vivienda, 2 apto, 3 terreno): ");
            int t = sc.nextInt();

            System.out.print("Valor: ");
            double v = sc.nextDouble();

            Categoria cat = (t == 1) ? Categoria.VIVIENDA :
                    (t == 2) ? Categoria.APARTAESTUDIO :
                            Categoria.TERRENO;

            ag.sumarVenta(new BienRaiz(v, cat));
        }

        return ag;
    }
}