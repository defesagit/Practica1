package org.Netec;


public abstract class CuentaDeAhorro extends Cuenta{
    private double tasaInteresMensual;

    public CuentaDeAhorro(int numero, double saldo, double tasaInteresMensual) {
        super(numero, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }
    public double calcularIntereses() {
        // El interés mensual se calcula como saldo * tasaInteresMensual
        return getSaldo() * tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                '}';
    }
}
