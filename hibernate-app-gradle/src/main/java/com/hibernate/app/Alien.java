package com.hibernate.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
  @Id private int oid;
  private String aname;
  private String color;

  public int getOid() {
    return oid;
  }

  public void setOid(int oid) {
    this.oid = oid;
  }

  public String getAname() {
    return aname;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
