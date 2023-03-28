package com.fredgar.pe;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Tarea
 * Dado un entero, x, realiza las siguientes acciones condicionales:
 *
 * Si X es impar, imprime Raro
 * Si X es par y está en el rango inclusivo de 2 Y 5, imprime No Raro
 * Si X es par y está en el rango inclusivo de 6 Y 20, imprime Raro
 * Si X es par y es mayor que 20, imprime No Raro
 * Completa el código proporcionado en tu editor para imprimir si X es raro o no.
 *
 * Formato de entrada
 *
 * Una sola línea que contiene un entero positivo, x.
 *
 * Restricciones
 *
 * Formato de salida
 *
 * Imprime Raro si el número es raro; de lo contrario, imprime No Raro.
 */

public class Problem02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa un número par \n");
    int n = scanner.nextInt();
    scanner.close();

    if (esRaro(n)) {
      System.out.println("Raro");
    } else {
      System.out.println("No Raro");
    }

    //System.out.println(esRaro(n)? "Es Raro" : "No es Raro");
  }

  public static boolean esRaro(int n) {
    if (n % 2 == 1) {
      return true;
    } else if (n >= 2 && n <= 5) {
      return false;
    } else if (n >= 6 && n <= 20) {
      return true;
    }else if (n > 20) {
      return false;
    }
    else {
      throw new IllegalArgumentException("El número ingresado debe estar entre 1 y 100, Inclusivo");
    }
  }
  }

