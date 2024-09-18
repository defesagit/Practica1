package org.Netec.Clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practica2 {
    public static void main(String[] args) {
        List<String>arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        long inicio = 0;
        for(int i = 0; i < 1_000_000; i++) {
            arrayList.add(new String("Cadena numero: " + i));
            linkedList.add(new String("Cadena numero: " + i));
        }
        System.out.println("Tiempo invertido en insertar una cadena usando ArrayList");
        long antes = System.nanoTime();
        //Linea 1
        arrayList.add (1000000, new String("Otra cadena por agregar"));
        System.out.println (System.nanoTime() - inicio);
        System.out.println("Tiempo invertido en insertar una cadena usando LinkedList");
        antes = System.nanoTime();
        //Linea 2
        linkedList.add (1000000, new String("Otra cadena por agregar"));
        System. out. println (System.nanoTime() - inicio);

    }
}
