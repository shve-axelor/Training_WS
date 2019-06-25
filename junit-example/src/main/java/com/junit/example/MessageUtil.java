package com.junit.example;

public class MessageUtil {
  private String message;

  public MessageUtil(String message) {
    this.message = message;
  }

  public String printMessage() {
    System.out.println(message);
    return message;
  }
  
  public String salutationMessage() {
    System.out.println(message ); 
    return message;
  }
  public void timePrintMessage() {
    System.out.println("Inside Time Method" );
    while(true);
  }
  public void printDivision() {
    System.out.println(message ); 
    int a = 0;
    int b = 1/a;
  }
}
