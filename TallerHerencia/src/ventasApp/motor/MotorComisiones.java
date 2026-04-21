package ventasApp.motor;

import ventasApp.dominio.*;

public class MotorComisiones {

    public double procesar(Agente ag) {

        double acumulado = 0;

        for (BienRaiz b : ag.getHistorial()) {

            double tarifa;

            switch (b.getCategoria()) {

                case VIVIENDA:
                    tarifa = 0.045;
                    break;

                case APARTAESTUDIO:
                    tarifa = 0.038;
                    break;

                default:
                    tarifa = 0.065;
            }

            acumulado += b.getCosto() * tarifa;
        }

        return acumulado;
    }
}