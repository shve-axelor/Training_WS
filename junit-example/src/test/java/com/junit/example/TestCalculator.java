package com.junit.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junit.example.Calculator;

public class TestCalculator {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}
