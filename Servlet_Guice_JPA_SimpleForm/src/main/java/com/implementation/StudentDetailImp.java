package com.implementation;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.entity.StudentDetail;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
import com.service.StudentService;

public class StudentDetailImp implements StudentService{

	//@Inject EntityManagerFactory emf;
	@Inject 
	Provider<EntityManager> emp;
	
	@Override
	@Transactional
	public String insertData(String name, String add, String email, long contact, String department) {
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
		
		StudentDetail sd = new StudentDetail();
		sd.setsName(name);
		sd.setsAddress(add);
		sd.setsEmail(email);
		sd.setsContact(contact);
		sd.setsDepartment(department);
		try {
			emp.get().persist(sd);
		}
		catch(PersistenceException e) {
			return "Record Is Not Inserted Due To Some Error.  Please Try Again.";
		}
		
		
//		em.getTransaction().commit();
		
		//emf.close();
		
		return "Record inserted successfully";
	}
	@Override
	@Transactional
	public List<StudentDetail> fetchData() {
	//	EntityManager em1 = emf.createEntityManager();
	//	em1.getTransaction().begin();
		
		Query query = emp.get().createQuery("Select s from StudentDetail s");  
		
		List q = query.getResultList();
		
//		em1.getTransaction().commit();
		
		return q;
	}
	@Override
	@Transactional
	public String deleteData(String del) {
//		EntityManager em2 = emf.createEntityManager();
//		em2.getTransaction().begin();
		Query qu = emp.get().createQuery( "delete from StudentDetail where sName = '" + del + "'");  
        
       int execution= qu.executeUpdate();  

//		em2.getTransaction().commit();
		
		if(execution==1)
		{
			return "The Record Is Deleted Successfully.";
		}
		else {
			return "The Record Of The Student Is Not Found.";
		}
	}
	@Override
	@Transactional
	public List<StudentDetail> searchData(String names) {
	//	EntityManager em3 = emf.createEntityManager();
	//	em3.getTransaction().begin();
		
		Query que = emp.get().createQuery("Select s from StudentDetail s where s.sName = '"+ names +"'");  
		List qe = que.getResultList();
		
	//	em3.getTransaction().commit();	
		return qe;
	}
	@Override
	@Transactional
	public String updateData(int dels, String namess, String address, String emails, long contacts, String departments) {
		
	//	Query qu = emp.get().createQuery( "update StudentDetail SET sName='"+ name + "', sEmail='"+ email +"', sAddress='"+ add +"', sContact="+ contact +", sDepartment='"+ department +"'  where sId="+ dels);  
        StudentDetail st = emp.get().find(StudentDetail.class, dels);
        st.setsAddress(address);
        st.setsContact(contacts);
        st.setsEmail(emails);
        st.setsName(namess);
        st.setsDepartment(departments);
      //  emp.get().persist(st);
	  //     int execution= qu.executeUpdate();
	       
        return "The Record Updated Successfully."+ dels;
	}
}
