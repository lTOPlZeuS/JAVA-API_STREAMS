package org.jesus.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
  public static void main(String[] args) {

    long nombres = Stream
    .of("Juan Guzman", "Pedro Gonzales", "", "Ana Random", "", "Juan Dominguez")
    .filter(String::isEmpty)
    .peek(System.out::println)
    .count();

    System.out.println("Nombres vacios: " + nombres);
  }
}