package org.mohan.app.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mohan.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("customerDB")
public class CustomerDB implements IGenericsDB<Customer>{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Customer> getAll() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Customer");
		List<Customer> customerList = (List<Customer>) query.list();
		return customerList;
	}

	public Customer getByPK(Customer obj) {
		Session session = sessionFactory.openSession();
		Customer customer = (Customer)session.get(Customer.class, obj.getNid());
		return customer;
	}

	public int delete(Customer obj) {
//		Session session = SessionDB.openSession();
//		Customer customer = (Customer) session.get(Customer.class, obj.getNid());
//		session.delete(customer);
//		SessionDB.closeSession(session);
		return 0;
	}

	public int add(Customer obj) {
//		Session session = SessionDB.openSession();
//		session.save(obj);
//		SessionDB.closeSession(session);
		return 0;
		}

	public int update(Customer obj) {
//		Session session = SessionDB.openSession();
//		session.update(obj);
//		SessionDB.closeSession(session);
		return 0;
	}
	
	
//	private boolean isCustomer(String nid) {
//		Session session = SessionDB.openSession();
//		Query query = session.createQuery("from Customer where nid = :nid")
//							.setParameter("nid", nid.toLowerCase());
//		boolean b =  query.uniqueResult() != null;
//		SessionDB.closeSession(session);
//		return b;
//	}

	public static void main(String[] args){
//		for (int i = 0; i < 10; i++) {
//			Customer customer = new Customer("id"+i,"Name"+i,"85 clark St, West haven,CT 06516",
//	    			"mohan5v5988@gmail.com",new Date(System.currentTimeMillis()),2039012155);
//			add(customer);	
//		}
//		
//		List<Customer> customers = CustomerDB.getAllCustomers();
//		if(customers.isEmpty()) System.out.println("Empty");
//		for(Customer c : customers){
//			System.out.println(c);
//		}
//		
//		deleteCustomer(11);
//		
//		
//		Customer customer = new Customer(10,"Updated Name","85 clark St, West haven,CT 06516",
//    			"mohan5v5988@gmail.com",new Date(System.currentTimeMillis()),2039012155);
//		updateCustomer(customer);
	}
}
