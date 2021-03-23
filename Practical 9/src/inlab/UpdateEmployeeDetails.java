package inlab;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployeeDetails {
	public static void main(String args[]) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s =f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		EmployeeDetails emp = s.load(EmployeeDetails.class, 190031251);
		emp.setEmpName("Sushanth_Reddy");
		emp.setEmpSalary("75000");
		emp.setEmpAddress("Vijayawada");
		s.save(emp);

		tx.commit(); 
	}
}
