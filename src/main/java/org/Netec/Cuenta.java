package org.Netec;

public abstract class Cuenta {
    private int numero;
    private String fechaApertura;
    private double saldo;
    private String fechaCancelacion;

    // Constructor
    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.fechaApertura = ""; // Inicializar por defecto
        this.fechaCancelacion = ""; // Inicializar por defecto
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "Número: " + numero +
                ", Fecha Apertura: '" + fechaApertura + '\'' +
                ", Saldo: " + saldo +
                ", Fecha Cancelación: '" + fechaCancelacion + '\'' +
                '}';
    }

    // Métodos abstractos (puedes agregar más si los necesitas)
    //public abstract void cancelarCuenta();
    public abstract void cuentaDeAhorro();
    public abstract void cuentaDeCheque();


}

