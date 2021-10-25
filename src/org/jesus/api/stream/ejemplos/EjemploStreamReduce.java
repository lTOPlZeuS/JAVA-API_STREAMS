package org.jesus.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
  public static void main(String[] args) {

    Stream<String> nombres = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez", "Pedro Gonzales", "Pedro Gonzales")
    .distinct();

    String resultados = nombres.reduce("Resultado de la concat: ", (a, b) -> a + " # " + b + ", ");
    System.out.println(resultados);
  }
}