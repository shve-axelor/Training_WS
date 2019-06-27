package com.axelor.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddressBook {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int perId;

  private String perName;
  private long perContact;
  private String perAddress;
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

  public long getPerContact() {
    return perContact;
  }

  public void setPerContact(long perContact) {
    this.perContact = perContact;
  }

  public String getPerAddress() {
    return perAddress;
  }

  public void setPerAddress(String perAddress) {
    this.perAddress = perAddress;
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
