package com.deloitte.sixthmvn.hibfourth;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deloitte.sixthmvn.hibfourth.dao.StudentDAO;
import com.deloitte.sixthmvn.hibfourth.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        StudentDAO edao = new StudentDAO(factory);
        Student s1 = new Student(101,"Vijay","Delhi");
        edao.insertStudent(s1);
        factory.close();
    }
}
