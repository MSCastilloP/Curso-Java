package integracion;

import negocio.Cliente;
import negocio.ServicioClientes;
import java.io.*;

public class DAOCliente implements ServicioClientes {

    FileWriter fw;
    FileReader fr;
    BufferedReader br;

    public DAOCliente() {
        try {
            fw=new FileWriter("clientes.txt",true);
        } catch (IOException e) {
            System.out.println("No se pudo crear el archivo!!!");
        }
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        try {
            fw.write(cliente.getNumero()+","+cliente.getNombre()
                    +","+cliente.getRfc()+","
            +cliente.getTelefono()+"\n");
            return true;
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo!!!");
            return false;
        }
    }

    @Override
    public boolean eliminarCliente(int numero) {
        return false;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        return null;
    }

    @Override
    public void listarClientes() {
        try {
            fr=new FileReader("clientes.txt");
            br=new BufferedReader(fr);
            System.out.println("*".repeat(50));
            br.lines().forEach(System.out::println);
            System.out.println("*".repeat(50));
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo leer el archivo!!!");
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo!!!");
        }

    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        return null;
    }

    public void cerrarArchivo(){
        try {
            fw.close();
        } catch (IOException e) {
            System.out.println("Hubo un problema al cerar el archivo!!!");
        }
    }
}
