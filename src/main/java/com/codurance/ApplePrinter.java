package com.codurance;

import java.util.List;

public class ApplePrinter {
  public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
    for (Apple apple : inventory) {
      String output = formatter.accept(apple);
      System.out.println(output);
    }
  }

  public static void main(String[] args) {
    List<Apple> apples = List.of(new Apple(100, Color.GREEN), new Apple(200, Color.RED));
    prettyPrintApple(apples, new AppleFancyFormatter());
    System.out.println("-----------------------------");
    prettyPrintApple(apples, new AppleSimpleFormatter());
  }
}
