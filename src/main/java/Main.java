package main.java;

import java.util.Optional;

public class Main {

    public static void main(String args[]) {
        probarOptional(null);
    }

    public static void probarOptional(String nombre) {
        System.out.println(nombre.length());
    }

    public static void crearOptional() {
        Optional<String> optional = Optional.empty();
        optional.get();
    }
}
