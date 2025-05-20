package negocio;

public interface ServicioClientes {
    boolean agregarCliente(Cliente cliente);

    boolean eliminarCliente(int id);

    Cliente consultarCLiente(int numero);

    void listarClientes();

    Cliente buscarCLientePorRfc(String rfc);

}
