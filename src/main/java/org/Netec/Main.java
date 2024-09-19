package org.Netec;

import org.Netec.Clases.Banco;
import org.Netec.Clases.Cliente;
import org.Netec.Clases.Domicilio;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Domicilio domicilio = new Domicilio("Calle 33", 311, "Guatape", "Antiquia", 5445);
        Banco banco = new Banco("Banco",domicilio, "qwerty", "4444444");

        // Crear un cliente usando el patrón Builder
        Cliente cliente = new Cliente.ClienteBuilder(1, "Juan Pérez")
                .conDomicilio(domicilio)
                .conRfc("JUAP850101")
                .conTelefono("555-1234")
                .conFechaNacimiento("1985-01-01")
                .build();

        // Imprimir el cliente
        System.out.println(cliente.toString());
        // Imprimir domicilio
        System.out.println(domicilio);
        //Imprimir Banco
        System.out.println(banco);

    }

}