package negocio;

import java.util.Comparator;
import java.util.Optional;

public class Cliente extends Persona implements Comparable<Cliente> , ServicioClientes {
    private int numero;
    private String rfc;
    private String telefono;

    public Cliente(String nombre, Domicilio domicilio, int edad, int numero, String rfc, String telefono) {
        super(nombre, domicilio, edad);
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

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                '}' +
                super.toString();
    }

    @Override
    public int compareTo(Cliente c) {
        if (this.numero < c.numero) {
            return -1;
        } else if (this.numero > c.numero) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean eliminarCliente(int id) {
        return false;
    }

    @Override
    public Cliente consultarCLiente(int numero) {
        return null;
    }

    @Override
    public void listarClientes() {

    }

    @Override
    public Cliente buscarCLientePorRfc(String rfc) {
        return null;
    }
}
