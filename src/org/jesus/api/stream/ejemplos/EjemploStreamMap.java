package org.jesus.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamMap{
  public static void main(String[] args) {
    Stream<Usuarios> nombres = Stream
    .of("Juan", "Pedro", "Maria", "Ana")
    .map(nombre -> new Usuarios(nombre,null))
    .peek(u -> System.out.println("Usuario: " + u.getNombre()))
    .map(usuario -> {
      String nombre = usuario.getNombre().toLowerCase();
      usuario.setNombre(nombre);
      return usuario;
    });
    
    List<Usuarios> lista = nombres.collect(Collectors.toList());
    lista.forEach(u -> System.out.println("Usuario: " + u.getNombre()));
  }
}