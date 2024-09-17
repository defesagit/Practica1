package org.Netec;

public class CuentaDeAhorro extends Cuenta{
    private double tasaInteresMensual;

    public CuentaDeAhorro(int numero, String fechaApertura, double saldo, String fechaCancelacion, double tasaInteresMensual) {
        super(numero, fechaApertura, saldo, fechaCancelacion);//
        this.tasaInteresMensual = tasaInteresMensual;
    }

    @Override
    public double calcularIntereses() {
        return getSaldo() * tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                '}';
    }
}
