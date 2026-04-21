package ventasApp;

import ventasApp.dominio.Agente;
import ventasApp.motor.*;

public class Inicio {

    public static void main(String[] args) {

        FlujoVentas flujo = new FlujoVentas();
        MotorComisiones motor = new MotorComisiones();

        Agente ag = flujo.iniciarProceso();

        double base = 1250000;
        double comision = motor.procesar(ag);

        System.out.println("\n=== PAGO ===");
        System.out.println("Agente: " + ag.getNombre());
        System.out.println("Base: $" + base);
        System.out.println("Comisión: $" + comision);
        System.out.println("Total: $" + (base + comision));
    }
}