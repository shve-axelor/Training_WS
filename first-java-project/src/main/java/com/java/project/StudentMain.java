package com.java.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("details");

    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    Student s1 = new Student();
    s1.setS_id(101);
    s1.setS_name("Shubh");
    s1.setS_age(21);

    Student s2 = new Student();
    s2.setS_id(102);
    s2.setS_name("Parth");
    s2.setS_age(22);

    Student s3 = new Student();
    s3.setS_id(103);
    s3.setS_name("Sachin");
    s3.setS_age(24);

    em.persist(s1);
    em.persist(s2);
    em.persist(s3);

    em.getTransaction().commit();

    emf.close();
    em.close();
  }
}
