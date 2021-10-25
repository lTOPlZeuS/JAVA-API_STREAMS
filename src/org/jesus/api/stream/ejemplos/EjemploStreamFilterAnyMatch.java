package org.jesus.api.stream.ejemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamFilterAnyMatch {
  public static void main(String[] args) {
    boolean existe = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez")
    .map(nombre -> new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
    .anyMatch(u -> u.getId().equals(7));

    List <Usuarios> lista = Arrays.asList(new Usuarios("Juan","Guzman"),
      new Usuarios("Pedro","Gonzales"),
      new Usuarios("Maria","Gutierrres"),
      new Usuarios("Ana","Random"),
      new Usuarios("Juan","Rocha"),
      new Usuarios("Juan","Dominguez"));

      boolean resultado = false;
      for (Usuarios u : lista) {
        if (u.getId().equals(7)) {
          resultado = true;
          break;
        }
      }

    System.out.println(resultado);
    System.out.println(existe);
  }
}