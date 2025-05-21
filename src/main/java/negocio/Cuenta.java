package negocio;

import java.time.LocalDate;

public abstract class Cuenta {
    private int numero;
    private LocalDate fecharApertura;
    private double saldo;
    private LocalDate fechaCancelacion;

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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFecharApertura() {
        return fecharApertura;
    }

    public void setFecharApertura(LocalDate fecharApertura) {
        this.fecharApertura = fecharApertura;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public  double abono(double cantidad) {
        return this.saldo = this.saldo  + cantidad;
    }

    public abstract double retiro(double cantidad);
}
