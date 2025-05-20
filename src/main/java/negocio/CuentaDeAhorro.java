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
        if(cantidad>this.getSaldo()){
            System.out.println("Fondos insuficientes");
            System.out.println("Saldo actual : " + this.getSaldo());
            return 0;
        }
        this.setSaldo(this.getSaldo()-cantidad);
        System.out.println("Retiro por:" + cantidad);
        System.out.println("Saldo por:" + this.getSaldo());
        return cantidad;
    }
}
