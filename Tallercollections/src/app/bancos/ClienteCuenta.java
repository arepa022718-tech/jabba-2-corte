package app.banco;

public class ClienteCuenta {

    private double saldo;

    public ClienteCuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sumar(double valor) {
        saldo += valor;
    }

    public boolean restar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}