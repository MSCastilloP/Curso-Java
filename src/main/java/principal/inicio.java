package principal;

import negocio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class inicio extends Object {
    public static void main(String[] args) {
        System.out.println("Sistema de Recursos Humanos");
        System.out.println("===========================");
        Domicilio domicilio2 = new Domicilio("Calle 12", "123", "Barrio 2", "Bogota", "123");
//        Persona p1 = new Persona("Ivan Mejia", domicilio2, 14);
//        System.out.println(p1);
//        p1.imprime();
//        p1.setEdad(15);
        //p1.imprime();
        Domicilio domicilio = new Domicilio("Calle 12", "123", "Barrio 2", "Bogota", "123");
        Domicilio domicilioBanco = new Domicilio("Calle Sultanito", "123", "Barrio 2", "Bogota", "123");
        ArrayList<Cuenta> cuentaList = new ArrayList<>();

        LocalDate fecharApertura = LocalDate.of(2022, 9, 22);
        CuentaDeAhorro cuentaDeAhorro = new CuentaDeAhorro(123, 8283832.2, 0.2);
        CuentaDeCheque cuentaDeCheque = new CuentaDeCheque(1234, 10);
        cuentaDeAhorro.setFecharApertura(fecharApertura);
        cuentaList.add(cuentaDeAhorro);
        cuentaList.add(cuentaDeCheque);

        cuentaDeAhorro.retiro(10);
        cuentaDeAhorro.retiro(8283832.2);
        cuentaDeCheque.retiro(1);
        cuentaDeCheque.retiro(10);


//


        Cliente cliente = new Cliente("Manuel", domicilio, 25, 128634, "MSCASTIL", "3021111");
        cliente.setCuentas(cuentaList);
//        cliente.abonaCuenta(1234, 1);
//        cliente.retirar(123, 8283832.2);
//        cliente.retirar(1234, 11);
        Cliente cliente2 = new Cliente("Santiago", domicilio, 30, 198232134, "Santiago", "30221111");
        Cliente cliente3 = new Cliente("Pedro", domicilio, 24, 1256234, "Pedro", "30214111");
        Cliente cliente4 = new Cliente("Pascar", domicilio, 75, 15623434, "Pascar", "380281111");
        cliente4.setCuentas(cuentaList);
        System.out.println(cliente);
        Banco banco = new Banco("Banco de la Republica", domicilioBanco, "123", "80120");
        banco.agregarCliente(cliente);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(cliente3);
        banco.agregarCliente(cliente4);
        banco.agregarCliente(cliente4);
        banco.consultarCliente(cliente.getNumero());
        banco.buscarClientePorRfc(cliente2.getRfc());
        banco.eliminarCliente(cliente.getNumero());
        banco.listarClientes();


    }
}