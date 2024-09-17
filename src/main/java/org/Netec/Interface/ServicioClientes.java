package org.Netec.Interface;

import org.Netec.Clases.Cliente;

public interface ServicioClientes {
    boolean AgregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);
    Cliente consultarCliente(int numero);
    Cliente obtenerClientes();
    Cliente buscarClientePorRFC(String rfc);

}
