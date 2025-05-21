package negocio;

import java.util.Optional;

public class CuentaDeAhorro extends Cuenta {
    double tasaInteresMensual;

    public CuentaDeAhorro(int numero, double saldo, double tasaInteresMensual) {
        super(numero, saldo);
    }

    public double calcularInteres() {
        return 0;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                '}';
    }


    @Override
    public double retiro(double cantidad) {
        var saldo = super.getSaldo();

        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
            return 0;
        } else {
            super.setSaldo(saldo - cantidad);
            System.out.println("Saldo retirado : " + cantidad + "Saldo cantidad: " + super.getSaldo());
            return saldo - cantidad;
        }
    }
}
