package com.junit.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //    Result result = JUnitCore.runClasses(TestFeatureSuite.class);
    Result result1 = JUnitCore.runClasses(TestJunit.class);

    for (Failure failure : result1.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result1.wasSuccessful());

    //    for (Failure failure : result.getFailures()) {
    //      System.out.println(failure.toString());
    //    }
    //
    //    System.out.println(result.wasSuccessful());
  }
}
