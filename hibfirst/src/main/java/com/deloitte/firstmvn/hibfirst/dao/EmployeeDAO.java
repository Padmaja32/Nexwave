package com.deloitte.firstmvn.hibfirst.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.deloitte.firstmvn.hibfirst.entity.Employee;

public class EmployeeDAO {
	SessionFactory factory = null;
	public EmployeeDAO(SessionFactory factory) {
		this.factory = factory;
	}
	public boolean insertEmployee(Employee e) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(e);
		trans.commit();
		session.close();
		return true;
	}
	public Employee getEmployee(int empid) {
		Session session = factory.openSession();
		Employee e = session.get(Employee.class, empid);
		session.close();
		return e;
	}
	public boolean updateEmployee(Employee e) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(e);
		trans.commit();
		session.close();
		return true;
	}
	public boolean deleteEmployee(int empid) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Employee e = session.get(Employee.class, empid);
		session.delete(e);
		trans.commit();
		session.close();
		return true;
	}

}
