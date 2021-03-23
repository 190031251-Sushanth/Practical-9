package inlab;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Scanner;

public class StoreEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SessionFactory f =new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		EmployeeDetails emp = new EmployeeDetails();
		
		System.out.println("Enter EmpId :");
		int EmpId = sc.nextInt();
		
		System.out.println("Enter EmpName :");
		String EmpName = sc.next();
		
		System.out.println("Enter EmpSalary :");
		String EmpSalary = sc.next();
		
		System.out.println("Enter EmpAddress :");
		String EmpAddress = sc.next();
		
		emp.setEmpId(EmpId);
		emp.setEmpName(EmpName);
		emp.setEmpSalary(EmpSalary);
		emp.setEmpAddress(EmpAddress);
		
		s.save(emp);
		tx.commit();
		
		System.out.println("Values inserted");
	}

}