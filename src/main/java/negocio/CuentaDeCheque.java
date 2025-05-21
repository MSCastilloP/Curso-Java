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
        var saldo = super.getSaldo();

        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes");
            double penalizacion=super.getSaldo()*.1;
            double remanente = super.getSaldo()-(super.getSaldo()*.1);
            System.out.println("Saldo anterior : " + super.getSaldo() + "Penalizacion por saldo insuficiente: "+ penalizacion +"Saldo remanente : " +remanente);
            this.setSaldo(remanente);
            return 0;
        } else {
            super.setSaldo(saldo - cantidad);
            System.out.println("Saldo retirado : " + cantidad + "Saldo cantidad: " + super.getSaldo());
            return saldo - cantidad;
        }
    }
}
