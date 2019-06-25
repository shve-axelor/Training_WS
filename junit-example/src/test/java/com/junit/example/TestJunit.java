package com.junit.example;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class TestJunit {
  String message = "Hello World";
  MessageUtil messageUtil = new MessageUtil(message);

  @Ignore
  @Test
  public void testPrintMessage() {
    message = "Hello World";
    assertEquals(message, messageUtil.printMessage());
  }

  @Test(timeout = 1000)
  public void testTimeMessage() {
    System.out.println("Inside Time Testing");
    messageUtil.timePrintMessage();
  }

  @Test(expected = ArithmeticException.class)
  public void testPrintDivision() {
    System.out.println("Inside testPrintDivision()");
    messageUtil.printDivision();
  }
}
