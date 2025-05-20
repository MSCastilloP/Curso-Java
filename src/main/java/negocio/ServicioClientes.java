package negocio;

public interface ServicioClientes {
    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);
    Cliente consultarCliente(int numero);
    void listarClientes();
    Cliente buscarClientePorRfc(String rfc);
}
