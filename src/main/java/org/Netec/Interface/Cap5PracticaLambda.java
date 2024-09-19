package org.Netec.Interface;

public interface Cap5PracticaLambda {

    @FunctionalInterface
    public interface Interfaz1 {
        void metodo(int a, String b, float c);
    }
    @FunctionalInterface
    public interface Interfaz2<A, B, C, D> {
        D metodo(A a, B b, C c);
    }

    @FunctionalInterface
    public interface Interfaz3 {
        String metodo(String a, String b);
    }

    @FunctionalInterface
    public interface Interfaz4 {
        void metodo();
    }

    @FunctionalInterface
    public interface Interfaz5 {
        Long metodo(int a, int b);
    }

    @FunctionalInterface
    public interface Interfaz6 {
        Number metodo(Integer a, Long b);
    }

    @FunctionalInterface
    public interface Interfaz7 {
        CharSequence metodo(String a, StringBuilder b);
    }

    @FunctionalInterface
    public interface Interfaz8 {
        Object metodo();
    }

    @FunctionalInterface
    public interface Interfaz9 {
        String metodo(Object a, Object b);
    }

    @FunctionalInterface
    public interface Interfaz10 {
        String metodo(int a, char b, float c);
    }



}
