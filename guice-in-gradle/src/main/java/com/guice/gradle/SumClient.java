package com.guice.gradle;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SumClient {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Injector injector = Guice.createInjector(new AddMod());
    Sum sum = injector.getInstance(Sum.class);
    System.out.println(sum.sum(10, 54));
  }
}
