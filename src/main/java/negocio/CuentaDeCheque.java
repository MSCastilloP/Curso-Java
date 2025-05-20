package negocio;

public class CuentaDeCheque extends Cuenta{
    private double costoManejoMensual;

    public CuentaDeCheque(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public String toString() {
        return "CuentaDeCheque{" +
                "costoManejoMensual=" + costoManejoMensual +
                '}';
    }

    @Override
    public double retiro(double cantidad) {
        return 0;
    }

}
