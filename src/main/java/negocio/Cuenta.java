package negocio;

public abstract class Cuenta {
    private int numero;
    private String fecharApertura;
    private double saldo;
    private String fechaCancelacion;

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fecharApertura='" + fecharApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecharApertura() {
        return fecharApertura;
    }

    public void setFecharApertura(String fecharApertura) {
        this.fecharApertura = fecharApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public  double abono(double cantidad) {

        return this.saldo = this.saldo  + cantidad;
    }

    public abstract double retiro(double cantidad);
}
