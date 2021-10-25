package org.jesus.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamReduceRange{
  public static void main(String[] args) {

    IntStream numeros = IntStream
    .range(5 , 20);

    IntSummaryStatistics stats = numeros.summaryStatistics();
    System.out.println(stats.getMax());
    System.out.println(stats.getMin());
    System.out.println(stats.getCount());
    System.out.println(stats.getAverage());
  }
}