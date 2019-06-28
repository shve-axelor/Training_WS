package com.axelor.db;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AddressBook {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int perId;

  @OneToMany(targetEntity = Mobile.class)
  private List<Mobile> mobile_numbers;

  @OneToMany(targetEntity = Address.class)
  private List<Address> address;

  public List<Address> getAddress() {
    return address;
  }

  public void setAddress(List<Address> address) {
    this.address = address;
  }

  public List<Mobile> getMobile_numbers() {
    return mobile_numbers;
  }

  public void setMobile_numbers(List<Mobile> mobile_numbers) {
    this.mobile_numbers = mobile_numbers;
  }

  private String perName;
  private String perState;
  private String perCity;

  public int getPerId() {
    return perId;
  }

  public void setPerId(int perId) {
    this.perId = perId;
  }

  public String getPerName() {
    return perName;
  }

  public void setPerName(String perName) {
    this.perName = perName;
  }

  public String getPerState() {
    return perState;
  }

  public void setPerState(String perState) {
    this.perState = perState;
  }

  public String getPerCity() {
    return perCity;
  }

  public void setPerCity(String perCity) {
    this.perCity = perCity;
  }
}
