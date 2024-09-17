package org.Netec;

public class CuentaDeCheque extends Cuenta{
    private double costoManejoMensual;

    public CuentaDeCheque(int numero, String fechaApertura, double saldo, String fechaCancelacion, double costoManejoMensual) {
        super(numero, fechaApertura, saldo, fechaCancelacion); //
        this.costoManejoMensual = costoManejoMensual;
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }



    @Override
    public String toString() {
        return "CuentaDeCheque{" +
                "costoManejoMensual=" + costoManejoMensual +
                '}';
    }

    @Override
    public double calcularIntereses() {
        return 0;
    }
}
