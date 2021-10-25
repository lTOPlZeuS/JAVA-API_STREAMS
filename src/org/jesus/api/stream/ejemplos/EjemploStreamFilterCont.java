package org.jesus.api.stream.ejemplos;

import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamFilterCont {
  public static void main(String[] args) {
    long count = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez")
    .map(nombre -> new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
    .count();

    System.out.println(count);
  }
}