package org.Netec.Clases;

import org.Netec.Interface.Comparable;
import org.Netec.Interface.ServicioCuentas;

import java.util.ArrayList;

public class Cliente implements ServicioCuentas, Comparable<Cuenta> {


    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(ClienteBuilder builder) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuentas=" + cuentas +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        return false;
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        return false;
    }

    @Override
    public void abonarCuenta(int Numero, double abono) {

    }

    @Override
    public void retirar(int numero, double retiro) {

    }

    @Override
    public Cuenta obtenerCuentas() {
        return null;
    }

    @Override
    public int compareTo(Cuenta obj) {
        return 0;
    }

    // Clase anidada estática Builder
    public static class ClienteBuilder {
        private int numero;
        private String nombre;
        private Domicilio domicilio;
        private String rfc;
        private String telefono;
        private ArrayList<Cuenta> cuentas = new ArrayList<>();
        private String fechaNacimiento;

        // Constructor del Builder con los atributos obligatorios
        public ClienteBuilder(int numero, String nombre) {
            this.numero = numero;
            this.nombre = nombre;
        }

        // Métodos para agregar los valores opcionales y retornando el mismo Builder (fluido)
        public ClienteBuilder conDomicilio(Domicilio domicilio) {
            this.domicilio = domicilio;
            return this;
        }

        public ClienteBuilder conRfc(String rfc) {
            this.rfc = rfc;
            return this;
        }

        public ClienteBuilder conTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public ClienteBuilder conCuentas(ArrayList<Cuenta> cuentas) {
            this.cuentas = cuentas;
            return this;
        }

        public ClienteBuilder conFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        // Método para construir el objeto Cliente
        public Cliente build() {
            return new Cliente(this);
        }

        @Override
        public String toString() {
            return "ClienteBuilder{" +
                    "numero=" + numero +
                    ", nombre='" + nombre + '\'' +
                    ", domicilio=" + domicilio +
                    ", rfc='" + rfc + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", cuentas=" + cuentas +
                    ", fechaNacimiento='" + fechaNacimiento + '\'' +
                    '}';
        }
    }
}
