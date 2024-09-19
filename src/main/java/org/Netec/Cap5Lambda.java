package org.Netec;

import org.Netec.Interface.Cap5PracticaLambda;

public class Cap5Lambda {
    public static void main(String[] args) {
        Cap5PracticaLambda.Interfaz1 i1 = (a, b, c) -> System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        i1.metodo(5, "Hello", 3.14f);

        // Ejemplo Interfaz2: A, B, C -> D
        Cap5PracticaLambda.Interfaz2<String, Integer, Double, Boolean> i2 = (a, b, c) -> a.length() > b && c > 2.0;
        System.out.println   (i2.metodo("Lambda", 3, 2.5));

        // Ejemplo Interfaz3: String, String -> String
        Cap5PracticaLambda.Interfaz3 i3 = (a, b) -> a + " " + b;
        System.out.println(i3.metodo("Hola", "Mundo"));

        // Ejemplo Interfaz4: ninguna entrada -> void
        Cap5PracticaLambda.Interfaz4 i4 = () -> System.out.println("Método sin parámetros");
        i4.metodo();

        // Ejemplo Interfaz5: int, int -> Long
        Cap5PracticaLambda.Interfaz5 i5 = (a, b) -> (long) a + b;
        System.out.println(i5.metodo(10, 20));

        // Ejemplo Interfaz6: Integer, Long -> Number
        Cap5PracticaLambda.Interfaz6 i6 = (a, b) -> a + b;
        System.out.println(i6.metodo(10, 20L));

        // Ejemplo Interfaz7: String, StringBuilder -> CharSequence
        Cap5PracticaLambda.Interfaz7 i7 = (a, b) -> a + b.toString();
        System.out.println(i7.metodo("Texto: ", new StringBuilder("Construido")));

        // Ejemplo Interfaz8: ninguna entrada -> Object
        Cap5PracticaLambda.Interfaz8 i8 = () -> new Object();
        System.out.println(i8.metodo());

        // Ejemplo Interfaz9: Object, Object -> String
        Cap5PracticaLambda.Interfaz9 i9 = (a, b) -> a.toString() + " - " + b.toString();
        System.out.println(i9.metodo(123, "Texto"));

        // Ejemplo Interfaz10: int, char, float -> String
        Cap5PracticaLambda.Interfaz10 i10 = (a, b, c) -> "a: " + a + ", b: " + b + ", c: " + c;
        System.out.println(i10.metodo(42, 'A', 3.14f));

    }




}
