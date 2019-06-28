package com.axelor.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int mId;

  private String type;
  private long contact;

  public int getmId() {
    return mId;
  }

  public void setmId(int mId) {
    this.mId = mId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getContact() {
    return contact;
  }

  public void setContact(long contact) {
    this.contact = contact;
  }
}
