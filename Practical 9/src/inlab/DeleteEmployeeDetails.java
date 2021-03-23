package inlab;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployeeDetails {
	public static void main(String args[]) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s =f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		EmployeeDetails emp = s.load(EmployeeDetails.class, 190031251);
		s.delete(emp);
		System.out.println("Values Deleted");
		tx.commit();
		
	}

}
