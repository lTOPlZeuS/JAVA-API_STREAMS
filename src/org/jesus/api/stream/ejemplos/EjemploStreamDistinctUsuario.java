package org.jesus.api.stream.ejemplos;

import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamDistinctUsuario {
  public static void main(String[] args) {

    Stream<Usuarios> nombres = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez","Juan Rocha","Juan Rocha")
    .distinct()
    .map(nombre -> new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]));

    nombres.forEach(System.out::println);
  }
}