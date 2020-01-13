package com.deloitte.firstmvn.hibfirst;

import java.sql.Date;
import java.util.Properties;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.firstmvn.hibfirst.dao.EmployeeDAO;
import com.deloitte.firstmvn.hibfirst.entity.Employee;

/**
 * Hello world!
 *
 */
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
    	cfg.addAnnotatedClass(Employee.class);
    	cfg.addProperties(prop);
   
    	SessionFactory factory = cfg.buildSessionFactory();
    	EmployeeDAO edao = new EmployeeDAO(factory);
    	//Employee e1 = new Employee(111,"john",11000,new Date(1999,02,28));
    	//edao.insertEmployee(e1);
    	//edao.deleteEmployee(102);
    	//if(e1!=null)
    		//System.out.println(e1.getName()+" "+e1.getSalary()+" "+e1.getDoj());
    	Employee e1 = new Employee(111,"johnny",11000,new Date(1999,02,28));
    	edao.updateEmployee(e1);
    	factory.close();
    }
}
