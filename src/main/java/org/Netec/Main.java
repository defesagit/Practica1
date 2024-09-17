package org.Netec;

import org.Netec.Clases.Domicilio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Domicilio domicilio = new Domicilio("Calle 33", 311,"Guatape", "Antiquia",5445);

        System.out.println(domicilio.toString()); //
    }
}