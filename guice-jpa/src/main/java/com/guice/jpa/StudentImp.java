package com.guice.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.google.inject.Inject;

public class StudentImp implements Student {

  @Inject private StudentEntity st;

  @Inject
  EntityManagerFactory
      emf; // here in jpa you don't need Persistence.createEntityManagerFacotry() method because we

  @Override // already created it using install(new JpaPersistModule("myFirstJpaUnit"))
  public StudentEntity getsName(int id) {
    // TODO Auto-generated method stub

    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    st = em.find(StudentEntity.class, id);
    //	System.out.println(se.getsName());

    return st;
  }
}
