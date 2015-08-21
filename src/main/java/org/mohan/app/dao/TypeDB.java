package org.mohan.app.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mohan.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("typeDB")
public class TypeDB implements IGenericsDB<Type> {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Type> getAll() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Type where active = ?")
							.setBoolean(0, true);
		List<Type> list = (List<Type>) query.list();
		return list;
	}

	public Type getByPK(Type obj) {
		
		return null;
	}

	public int delete(Type obj) {
		
		return 0;
	}

	public int add(Type obj) {
		
		return 0;
	}

	public int update(Type obj) {
		
		return 0;
	}
}
