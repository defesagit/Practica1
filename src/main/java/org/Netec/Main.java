package org.Netec;

import org.Netec.Clases.Banco;
import org.Netec.Clases.Cliente;
import org.Netec.Clases.Cuenta;
import org.Netec.Clases.Domicilio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Domicilio domicilio = new Domicilio("Calle 33", 311, "Guatape", "Antiquia", 5445);
        Banco banco = new Banco("Banco",domicilio, "qwerty", "4444444");
        Cliente cliente = new Cliente(1, "Deybi", domicilio, "rfc123", "111 12345", "12345","2000-01-01");

//        // Crear un cliente usando el patrón Builder
//        Cliente cliente = new Cliente.ClienteBuilder(1, "Juan Pérez")
//                .conDomicilio(domicilio)
//                .conRfc("JUAP850101")
//                .conTelefono("555-1234")
//                .conFechaNacimiento("1985-01-01")
//                .build();
//        Cliente cliente2 = new Cliente.ClienteBuilder(1, "Maria")
//                .conDomicilio(domicilio)
//                .conRfc("Call 2")
//                .conTelefono("222-1234")
//                .conFechaNacimiento("1985-01-01")
//                .build();
//        Cliente cliente3 = new Cliente.ClienteBuilder(1, "Jose")
//                .conDomicilio(domicilio)
//                .conRfc("Call 3")
//                .conTelefono("333-1234")
//                .conFechaNacimiento("1985-01-01")
//                .build();
//        Cliente cliente4 = new Cliente.ClienteBuilder(1, "David")
//                .conDomicilio(domicilio)
//                .conRfc("Call 4")
//                .conTelefono("444-1234")
//                .conFechaNacimiento("1985-01-01")
//                .build();
//        Cliente cliente5 = new Cliente.ClienteBuilder(1, "David")
//                .conDomicilio(domicilio)
//                .conRfc("Call 4")
//                .conTelefono("444-1234")
//                .conFechaNacimiento("1985-01-01")
//                .build();
        Cuenta cuenta1 = new Cuenta(1, "2024-01-01",120000, "") {
            @Override
            public double calcularIntereses() {
                return 0;
            }
        };

        Cuenta cuenta2 = new Cuenta(2, "2024-02-01",130000, "") {
            @Override
            public double calcularIntereses() {
                return 0;
            }
        };


        // Imprimir el cliente
        System.out.println(cliente.toString());
//        System.out.println(cliente2.toString());
//        System.out.println(cliente3.toString());
//        System.out.println(cliente4.toString());
//        System.out.println(cliente5.toString());

        // Imprimir domicilio
        System.out.println(domicilio);
        //Imprimir Banco
        System.out.println(banco);
        //Imprimir Cuenta
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        List<Cliente> listaclientes = new ArrayList<>();
        listaclientes.add(new Cliente(6, "Deybi", domicilio, "rfc123","111 2222","123", "2000-01-01"));

        listaclientes.stream()
                .filter(t-> t.getNombre().startsWith("D"))
                .forEach(t-> System.out.println(t));//Stream

    }

}