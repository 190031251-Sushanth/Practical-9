package orders;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Scanner;

public class StoreOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Orders o = new Orders();
		
		o.setID(123);
		o.setOrderDate("28/03/2021");
		o.setOrderName("Red Roses");
		o.setCustomerId(190031251);
		o.setTotalAmount(500.0);
		
		s.save(o);
		
		tx.commit();
		System.out.println("Values Inserted");
	}

}