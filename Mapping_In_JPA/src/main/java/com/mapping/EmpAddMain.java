package com.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpAddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Collection");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Address a1 =new Address();
		a1.setCity("Rajkot");
		a1.setState("Gujarat");
		a1.setPincode(360005);
		
		Employee e1 = new Employee();
		e1.seteName("Shubh");
		e1.getAdd().add(a1);
		
	//	e1.getAdd().put(1,a1); when using hashmap where add is the map reference
		
		em.persist(e1);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
