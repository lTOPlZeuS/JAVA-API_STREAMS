package org.jesus.api.stream.ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamMap{
  public static void main(String[] args) {
    Stream<Usuarios> nombres = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random")
    .map(nombre -> new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
    .peek(System.out::println)
    .map(usuario -> {
      String nombre = usuario.getNombre().toUpperCase();
      usuario.setNombre(nombre);
      return usuario;
    });
    
    List<Usuarios> lista = nombres.collect(Collectors.toList());
    lista.forEach(System.out::println);
  }
}