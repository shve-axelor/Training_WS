package com.mapping.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int sId;

  private String sName;

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
}
