package negocio;

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
        return 0;
    }
}
