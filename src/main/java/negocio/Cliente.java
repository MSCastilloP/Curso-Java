package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Cliente extends Persona implements Comparable<Cliente>, ServicioCuentas{
    private int numero;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private LocalDate fechaNacimiento;


    public Cliente(String nombre, Domicilio domicilio, int edad, int numero, String rfc, String telefono) {
        super(nombre, domicilio, edad); // construye la parte Persona que es el cliente
        this.setNumero(numero);
        this.setRfc(rfc);
        this.setTelefono(telefono);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void habla() {
        System.out.println("El cliente pide su estado de cuenta");
    }

    //    @Override  // Sirve para indicar al programador que es un metodo que viene de la clase padre que estas sobreescribiendo.
    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                '}'+
                super.toString();
    }


    @Override
    public int compareTo(Cliente c) {
        if(this.numero < c.numero){
            return -1;
        }else if(this.numero>c.numero){
            return +1;
        }else {
            return 0;
        }
    }

    @Override
    public boolean buscaCuenta(int numero) {
        if (this.numero!=numero){
            System.out.println("Cuenta numero " + numero+"no existe");
            return false;
        }else {
            return true;
        }


    }

    public void abonaCuenta(int numeroCuenta, double cantidad){

        Optional<Cuenta> cuenta = cuentas.stream()
                .filter(c -> c.getNumero() == numeroCuenta)
                .findFirst();
        if (cuenta.isPresent()) {
            cuenta.get().abono(cantidad);
            System.out.println("Abono exitoso a la cuenta " + numeroCuenta);
            System.out.println(cuenta.get().getSaldo());
        } else {
            System.out.println("Cuenta número " + numeroCuenta + " no existe");
        }
    }

    public void retirar(int numeroCuenta, double cantidad){
        Optional<Cuenta> cuenta = cuentas.stream()
                .filter(c -> c.getNumero() == numeroCuenta)
                .findFirst();

        if (cuenta.isPresent()) {
            cuenta.get().retiro(cantidad);
            System.out.println("Retiro exitoso de la cuenta " + numeroCuenta);
            System.out.println(cuenta.get().getSaldo());
        } else {
            System.out.println("Cuenta número " + numeroCuenta + " no existe");
        }
    }
}
