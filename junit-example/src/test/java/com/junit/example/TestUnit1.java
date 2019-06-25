package com.junit.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnit1 {
  String message = "Robert";
  MessageUtil messageUtil = new MessageUtil(message);

  @Test
  public void testPrintMessage() {
    System.out.println("Inside testPrintMessage()");
    assertEquals(message, messageUtil.printMessage());
  }
}
