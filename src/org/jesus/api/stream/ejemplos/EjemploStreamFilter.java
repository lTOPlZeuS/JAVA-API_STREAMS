package org.jesus.api.stream.ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamFilter {
  public static void main(String[] args) {
    Stream<Usuarios> nombres = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez")
    .map(nombre -> new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
    .filter(u -> u.getNombre().equals("Juan"))
    .peek(System.out::println);
    
    List<Usuarios> lista = nombres.collect(Collectors.toList());
    lista.forEach(System.out::println);
  }
}