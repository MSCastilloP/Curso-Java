package negocio;

import java.util.*;
import java.util.function.Predicate;

public class Banco implements ServicioClientes {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    //private ArrayList<Cliente> clientes;
    private TreeSet<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = new TreeSet<>();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Domicilio getDomicilio() { return domicilio; }
    public void setDomicilio(Domicilio domicilio) { this.domicilio = domicilio; }
    public String getRfc() { return rfc; }
    public void setRfc(String rfc) { this.rfc = rfc; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public TreeSet<Cliente> getClientes() { return clientes; }
    public void setClientes(TreeSet<Cliente> clientes) { this.clientes = clientes; }

    @Override
    public String toString() {
        return nombre + ", " + domicilio.toString() + ", RFC: " + rfc + ", Tel: " + telefono;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        Cliente c = consultarCliente(cliente.getNumero());
        if (c==null) {
            clientes.add(cliente);
            System.out.println("Se agrego el cliente numero:"+cliente.getNumero());
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean eliminarCliente(int numero) {
        Cliente c = consultarCliente(numero);
        if (c!=null){
            clientes.remove(c);
            System.out.println("Se elimino el cliente numero:"+numero);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Cliente consultarCLiente(int numero) {
        return null;
    }

    public Cliente consultarCliente(int numero) {
        for(Cliente c:clientes){
            if(c.getNumero()==numero){
                System.out.println("Se encontro el cliente numero:"+numero);
                return c;
            }
        }
        System.out.println("No se encontro el cliente con numero:"+numero);
        return null;
    }

    // Implementar Streams
    @Override
    public void listarClientes() {
        System.out.println("=".repeat(50));
//        for(Cliente c:clientes){
//            System.out.println(c);
//        }
        clientes.forEach(System.out::println);
        System.out.println("=".repeat(50));



//        clientes.stream()
//                .filter(cliente->cliente.getNombre().endsWith("o"))
//                .forEach(cliente-> System.out.println(cliente));
//        Optional<Cliente> existio = clientes.stream().findFirst();
//        Cliente c=null;
//        if(existio.isPresent()){
//            c=existio.get();
//            System.out.println("El primero fue: "+c);
//        }else{
//            System.out.println("No hubo ningun cliente en el Stream");
//        }

    }

    @Override
    public Cliente buscarCLientePorRfc(String rfc) {
        Predicate<Cliente> clientePredicate = cliente -> cliente.getRfc().contains(rfc);
        return clientes.stream().filter(clientePredicate).findFirst().get();
    }

    public Cliente buscarCLientePorNumero(String numero) {
        Predicate<Cliente> clientePredicate = cliente -> cliente.getRfc().contains(rfc);
        return clientes.stream().filter(clientePredicate).findFirst().get();
    }

    public Cliente buscarClientePorRfc(String rfc) {
        for(Cliente c:clientes){
            if(c.getRfc().equals(rfc)){
                System.out.println("Se encontro el cliente con rfc:"+rfc);
                return c;
            }
        }
        return null;
    }
}