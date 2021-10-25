package org.jesus.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDistinct {
  public static void main(String[] args) {

    Stream<String> nombres = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez", "Pedro Gonzales", "Pedro Gonzales")
    .distinct();

    nombres.forEach(System.out::println);
  }
}