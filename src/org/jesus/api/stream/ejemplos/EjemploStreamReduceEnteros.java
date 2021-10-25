package org.jesus.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceEnteros{
  public static void main(String[] args) {

    Stream<Integer> nombres = Stream
    .of(5, 10, 15, 20);

    // Integer resultados = nombres.reduce(0, (a, b) -> a + b);
    Integer resultados = nombres.reduce(0, Integer::sum);
    System.out.println(resultados);
  }
}