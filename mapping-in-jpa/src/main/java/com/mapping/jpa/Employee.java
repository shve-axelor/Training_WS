package com.mapping.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int eId;

  private String eName;

  @ElementCollection private List<Address> add = new ArrayList<Address>();

  public int geteId() {
    return eId;
  }

  public void seteId(int eId) {
    this.eId = eId;
  }

  public String geteName() {
    return eName;
  }

  public void seteName(String eName) {
    this.eName = eName;
  }

  public List<Address> getAdd() {
    return add;
  }

  public void setAdd(List<Address> add) {
    this.add = add;
  }
}
