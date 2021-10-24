package org.jesus.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream{
  public static void main(String[] args) {
    Stream<String> nombres = Stream.of("Juan", "Pedro", "Maria", "Ana");
    nombres.forEach(System.out::println);

    String [] arreglo = {"Juan", "Pedro", "Maria", "Ana"};
    Stream<String> nombres2 = Arrays.stream(arreglo);
    nombres2.forEach(System.out::println);

    Stream<String> nombres3 = Stream.<String>builder().add("Juan").add("Pedro").add("Maria").add("Ana").build();
    nombres3.forEach(System.out::println);

    List <String> lista = new ArrayList<>();
    lista.add("Juan");
    lista.add("Pedro");
    lista.add("Maria");
    lista.add("Ana");

    Stream<String> nombres4 = lista.stream();
    nombres4.forEach(System.out::println);

    lista.stream().forEach(System.out::println);    
  }
}