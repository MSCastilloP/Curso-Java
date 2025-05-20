package principal;

import negocio.Banco;
import negocio.Cliente;
import negocio.Domicilio;
import negocio.Persona;

public class inicio extends Object {
    public static void main(String[] args) {
        System.out.println("Sistema de Recursos Humanos");
        System.out.println("===========================");
        Domicilio domicilio2 = new Domicilio("Calle 12", "123", "Barrio 2", "Bogota", 123);
//        Persona p1 = new Persona("Ivan Mejia", domicilio2, 14);
//        System.out.println(p1);
//        p1.imprime();
//        p1.setEdad(15);
        //p1.imprime();
        Domicilio domicilio = new Domicilio("Calle 12", "123", "Barrio 2", "Bogota", 123);
        Domicilio domicilioBanco = new Domicilio("Calle Sultanito", "123", "Barrio 2", "Bogota", 123);

        Cliente cliente = new Cliente("Manuel", domicilio, 25, 128634, "MSCASTIL", "3021111");
        Cliente cliente2 = new Cliente("Santiago", domicilio, 30, 198232134, "Santiago", "30221111");
        Cliente cliente3 = new Cliente("Pedro", domicilio, 24, 1256234, "Pedro", "30214111");
        Cliente cliente4 = new Cliente("Pascar", domicilio, 75, 15623434, "Pascar", "380281111");
        System.out.println(cliente);
        Banco banco = new Banco("Banco de la Republica", domicilioBanco, "123", "80120");
        banco.agregarCliente(cliente);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(cliente3);
        banco.agregarCliente(cliente4);
        banco.agregarCliente(cliente4);
        banco.consultarCLiente(cliente.getNumero());
        banco.buscarCLientePorRfc(cliente2.getRfc());
        banco.eliminarCliente(cliente.getNumero());
        banco.listarClientes();


    }
}