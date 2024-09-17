package org.Netec.Interface;

import org.Netec.Clases.Cuenta;

public interface ServicioCuentas {

    boolean agregarCuenta(Cuenta cuenta);
    boolean cancelarCuenta(int numero);
    void abonarCuenta(int Numero, double abono);
    void  retirar(int numero, double retiro);
    Cuenta obtenerCuentas();
}
