package org.jesus.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
  public static void main(String[] args) {
    // Generate
    // Genera una secuencia infinita de valores
    AtomicInteger atomicInteger = new AtomicInteger(0);
    Stream.generate(()->{
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "Hola Jesu, numero de veces: "+atomicInteger.incrementAndGet();
    }).limit(20).forEach(System.out::println);
  }
}