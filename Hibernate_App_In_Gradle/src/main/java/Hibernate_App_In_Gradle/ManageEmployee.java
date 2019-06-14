package Hibernate_App_In_Gradle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*employee e1 = new employee();
		e1.setFirst_name("Prerak");
		e1.setLast_name("Shah");
		e1.setAddress("Axelor Technologies Private Limited");*/
		
		employee e2=new employee();
		e2.setFirst_name("Gaurav");
		e2.setLast_name("Chawla");
		
		regular_emp e3=new regular_emp();
		e3.setFirst_name("Vivek");
		e3.setLast_name("Kumar");
		e3.setSalarys(50000);
		e3.setBonus(5);
		
		contract_emp e4 = new contract_emp();
		e4.setFirst_name("Arjun");
		e4.setLast_name("Kumar");
		e4.setPay_per_hour(1000);
		e4.setContract_duration("10 hours");
		
		Configuration con = new Configuration().configure();
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t1 = session.beginTransaction();
		
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
	//	t1.commit();
			
		employee emp = (employee) session.get(employee.class, 2);
	//	emp.setFirst_name("Sachin");
	//	session.update(emp);
	//	session.delete(emp);// for deleting specific record
		t1.commit();
		System.out.println("Successfully Executed");
		session.close();
		sf.close();

	}

}
