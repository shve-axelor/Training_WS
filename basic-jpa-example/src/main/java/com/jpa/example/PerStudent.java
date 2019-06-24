package com.jpa.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// @Table(name="perstudent")
public class PerStudent {

  @Id private int sId;
  private String sName;
  private int sAge;

  public PerStudent(int sId, String sName, int sAge) {
    super();
    this.sId = sId;
    this.sName = sName;
    this.sAge = sAge;
  }

  public PerStudent() {}

  public int getsId() {
    return sId;
  }

  public void setsId(int sId) {
    this.sId = sId;
  }

  public String getsName() {
    return sName;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public int getsAge() {
    return sAge;
  }

  public void setsAge(int sAge) {
    this.sAge = sAge;
  }
}
