package org.jesus.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStremListToStream {
  public static void main(String[] args) {
    // Crear una lista de enteros
    List<Usuarios> lista = new ArrayList<>();
    lista.add(new Usuarios("Andres","Guzman"));
    lista.add(new Usuarios("Juan","Perez"));
    lista.add(new Usuarios("Pedro","Aaron"));
    lista.add(new Usuarios("Jose","Rodriguez"));
    lista.add(new Usuarios("Jerez","Dominguez"));

    Stream<String> nombres = lista.stream().map(u -> u.getNombre().toUpperCase().concat(" ").concat(u.getApellido().toUpperCase())).flatMap(nombre ->{
      if(nombre.contains("JOSE RODRIGUEZ")){
        return Stream.of(nombre.concat(" ").concat("ES UN GANADOR"));
      }else{
        return Stream.empty();
      }
    }).peek(System.out::println);

    System.out.println(nombres.count());
  }
}
