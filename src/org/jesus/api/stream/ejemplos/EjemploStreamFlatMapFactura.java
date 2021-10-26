package org.jesus.api.stream.ejemplos;

import java.util.Arrays;
import java.util.List;

import org.jesus.api.stream.ejemplos.models.Factura;
import org.jesus.api.stream.ejemplos.models.Usuarios;

public class EjemploStreamFlatMapFactura {
  public static void main(String[] args) {
    Usuarios u1 = new Usuarios("Jhon","Salchichon");
    Usuarios u2 = new Usuarios("Benito","Tocamelo");

    u1.addFactura(new Factura("Factura Electrodomesticos"));
    u1.addFactura(new Factura("Factura de Agua"));
    u1.addFactura(new Factura("Factura de Luz"));
    //Usuario 2
    u2.addFactura(new Factura("Factura de Telefono"));
    u2.addFactura(new Factura("Factura de Internet"));
    List<Usuarios> usuarios = Arrays.asList(u1,u2);
    // for (Usuarios usuario : usuarios) {
    //   System.out.println("Usuario: "+usuario.getNombre()+" "+usuario.getApellido());
    //   for (Factura factura : usuario.getFacturas()) {
    //     System.out.println("\tFactura: "+factura.getDescripcion());
    //   }
    // }
    //Lo mismo de arriba pero con flatmap

    usuarios.stream()
    .flatMap(f -> f.getFacturas().stream())
    .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente").concat(f.toString())));
  }
}
