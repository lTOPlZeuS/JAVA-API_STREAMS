package org.jesus.api.stream.ejemplos;

import java.util.Optional;
import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamFilterSingle{
  public static void main(String[] args) {

    Stream<Usuarios> nombres = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez")
    .map(nombre -> new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
    .filter(u -> u.getNombre().equals("Juanxd"))
    .peek(System.out::println);

    Optional<Usuarios> usuario = nombres.findFirst();
    // System.out.println(usuario.orElse(new Usuarios("Jesus","Rocha")));
    // System.out.println(usuario.orElseGet(()-> new Usuarios("Jesus","Rocha")));
    // System.out.println(usuario.orElseThrow(()-> new RuntimeException("No se encontro el usuario")));

    if(usuario.isPresent()){
      System.out.println(usuario.get());
    }else{
      System.out.println("No se encontro el usuario");
    }
  }
}