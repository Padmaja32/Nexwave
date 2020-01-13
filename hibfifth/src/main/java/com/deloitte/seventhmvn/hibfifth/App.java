package com.deloitte.seventhmvn.hibfifth;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deloitte.seventhmvn.hibfifth.dao.StudentDAO;
import com.deloitte.seventhmvn.hibfifth.entity.Student;



public class App 
{
    public static void main( String[] args )
    {
    	Properties prop = new Properties();
    	prop.put("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
    	prop.put("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:orcl");
    	prop.put("hibernate.connection.username","scott");
    	prop.put("hibernate.connection.password","tiger");
    	prop.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
    	prop.put("hibernate.show_sql","true");
    	Configuration cfg = new Configuration();
    	cfg.addAnnotatedClass(Student.class);
    	cfg.addProperties(prop);
        SessionFactory factory = cfg.buildSessionFactory();
        StudentDAO edao = new StudentDAO(factory);
        Student s1 = new Student(101,"Vijay","Delhi");
        edao.insertStudent(s1);
        factory.close();
    }
}
