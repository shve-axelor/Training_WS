package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Alien a1 = new Alien();
    a1.setOid(16);
    a1.setAname("Sachin");
    a1.setColor("Blue");
    // System.out.print("hello");

    Configuration con = new Configuration().configure();

    SessionFactory sf = con.buildSessionFactory();

    Session session = sf.openSession();

    Transaction tx = session.beginTransaction();

    session.save(a1);

    tx.commit();
  }
}
