package com.mapping.jpa;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
  private int pincode;
  private String state;
  private String city;

  public int getPincode() {
    return pincode;
  }

  public void setPincode(int pincode) {
    this.pincode = pincode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
