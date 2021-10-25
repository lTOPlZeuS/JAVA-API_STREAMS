package org.jesus.api.stream.ejemplos;

import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamFilterSingle2 {
  public static void main(String[] args) {
    Usuarios nombres = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez")
    .map(nombre -> new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
    .filter(u -> u.getId().equals(8))
    .findFirst()
    .orElseGet(() -> new Usuarios("Freddy","Barba"));

    System.out.println(nombres);
  }
}