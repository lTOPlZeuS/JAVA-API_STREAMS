package org.jesus.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamDistinctUsuarioSum {
  public static void main(String[] args) {

    IntStream largoNombre = Stream
    .of("Juan Guzman", "Pedro Gonzales", "Maria Gutierrres", "Ana Random", "Juan Rocha", "Juan Dominguez","Juan Rocha","Juan Rocha")
    .distinct()
    .map(nombre -> new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
    .mapToInt(usuario -> usuario.toString().length());

    // largoNombre.forEach(System.out::println);
    IntSummaryStatistics stats = largoNombre.summaryStatistics();
    System.out.println(stats.getSum());
    System.out.println(stats.getCount());
  }
}