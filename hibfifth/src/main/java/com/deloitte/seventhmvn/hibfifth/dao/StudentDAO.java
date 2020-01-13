package com.deloitte.seventhmvn.hibfifth.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.deloitte.seventhmvn.hibfifth.entity.Student;




public class StudentDAO {
	SessionFactory factory = null;
	public StudentDAO(SessionFactory factory) {
		this.factory = factory;
	}
	public boolean insertStudent(Student s) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(s);
		trans.commit();
		session.close();
		return true;
	}
	public Student getStudent(int sid) {
		Session session = factory.openSession();
		Student e = session.get(Student.class, sid);
		session.close();
		return e;
	}
	public boolean updateStudent(Student s) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(s);
		trans.commit();
		session.close();
		return true;
	}
	public boolean deleteStudent(int sid) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Student s = session.get(Student.class, sid);
		session.delete(s);
		trans.commit();
		session.close();
		return true;
	}

}
