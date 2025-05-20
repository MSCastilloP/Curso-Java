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
        if(cantidad>this.getSaldo()){
            System.out.println("Fondos insuficientes");
            double penalizacion=this.getSaldo()*.1;
            double remanente = this.getSaldo()-(this.getSaldo()*.1);
            System.out.println("Saldo anterior : " + this.getSaldo() + "Penalizacion por saldo insuficiente: "+ penalizacion +"Saldo remanente : " +remanente);
            this.setSaldo(remanente);
            return 0;
        }
        this.setSaldo(this.getSaldo()-cantidad);
        System.out.println("Retiro por:" + cantidad);
        System.out.println("Saldo por:" + this.getSaldo());
        return cantidad;
    }

}
