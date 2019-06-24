package com.jpa.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("detail");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    PerStudent p1 = new PerStudent();
    p1.setsId(103);
    p1.setsName("Sachin");
    p1.setsAge(21);

    em.persist(p1);

    PerStudent p2 = em.find(PerStudent.class, 103);
    System.out.println(p2.getsName());
    p2.setsAge(30);

    //	em.remove(p2);

    em.getTransaction().commit();

    emf.close();
    em.close();
  }
}
