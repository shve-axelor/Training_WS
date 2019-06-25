package com.junit.example;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class TestUnit2 {

  String message = "Robert";
  MessageUtil messageUtil = new MessageUtil(message);

  @Test
  @Ignore
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!" + "Robert";
    assertEquals(message, messageUtil.salutationMessage());
  }
}
