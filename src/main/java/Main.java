package main.java;

import java.util.Optional;

public class Main {

    public static void main(String args[]) {
        //probarOptional(null);
        orElseOptional("pipe");
        orElseOptional(null);
        orElseThrow("pipe1");
        //orElseThrow(null);
        isPresent("pipe2");
        isPresent(null);
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

    public static void orElseThrow(String nombre) {
        Optional<String> optional = Optional.ofNullable(nombre);
        optional.orElseThrow(IllegalArgumentException::new);
        String nombre1 = optional.get();
        System.out.println(nombre1);
    }

    public static void isPresent(String nombre) {
        Optional<String> optional = Optional.ofNullable(nombre);
        System.out.println(optional.isPresent());
    }
}
