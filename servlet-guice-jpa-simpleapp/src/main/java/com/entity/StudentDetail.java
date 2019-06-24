package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class StudentDetail {

  @Id
  @SequenceGenerator(
      name = "student",
      sequenceName = "studentid",
      initialValue = 1001,
      allocationSize = 1000)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student")
  private int sId;

  private String sName;
  private String sAddress;
  private String sEmail;
  private String sDepartment;
  private long sContact;

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

  public String getsAddress() {
    return sAddress;
  }

  public void setsAddress(String sAddress) {
    this.sAddress = sAddress;
  }

  public String getsEmail() {
    return sEmail;
  }

  public void setsEmail(String sEmail) {
    this.sEmail = sEmail;
  }

  public String getsDepartment() {
    return sDepartment;
  }

  public void setsDepartment(String sDepartment) {
    this.sDepartment = sDepartment;
  }

  public long getsContact() {
    return sContact;
  }

  public void setsContact(long sContact) {
    this.sContact = sContact;
  }
}
