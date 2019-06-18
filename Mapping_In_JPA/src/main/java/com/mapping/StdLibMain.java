package com.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StdLibMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Collection");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setsName("Shubh");
		
		em.persist(s1);
		
		Library l1 =new Library();
		l1.setbName("JAVA THE COMPLETE REFERENCE");
		l1.setStd(s1);
		
		em.persist(l1);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
