package com.mapping.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Library {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int bId;

  private String bName;

  @OneToOne private Student std;

  public int getbId() {
    return bId;
  }

  public void setbId(int bId) {
    this.bId = bId;
  }

  public String getbName() {
    return bName;
  }

  public void setbName(String bName) {
    this.bName = bName;
  }

  public Student getStd() {
    return std;
  }

  public void setStd(Student std) {
    this.std = std;
  }
}
