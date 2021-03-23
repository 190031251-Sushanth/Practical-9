package inlab;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetriveEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s =f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		EmployeeDetails emp = new EmployeeDetails();
		
		Query sql = s.createQuery("from EmployeeDetails");
		List<EmployeeDetails> list = sql.getResultList();
		System.out.println(list.size());
		Iterator<EmployeeDetails> iter = list.iterator();
		
		while(iter.hasNext()) {
			emp = iter.next();
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getEmpSalary());
			System.out.println(emp.getEmpAddress());
		} 
	}

}