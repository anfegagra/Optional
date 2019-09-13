package main.java;

import java.util.Optional;

public class Main {

    public static void main(String args[]) {
        //probarOptional(null);
        orElseOptional("pipe");
        orElseOptional(null);
    }

    public static void probarOptional(String nombre) {
        System.out.println(nombre.length());
    }

    public static void crearOptional() {
        Optional<String> optional = Optional.empty();
        optional.get();
    }

    public static void orElseOptional(String nombre) {
        Optional<String> optional = Optional.ofNullable(nombre);
        String nombreOfNullable = optional.orElse("Vacio");
        System.out.println(nombreOfNullable);
    }
}
