package com.deloitte.fourthmvn.firstspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.fourthmvn.firstspringapp.beans.Person;
import com.deloitte.fourthmvn.firstspringapp.beans.Wisher;
import com.deloitte.fourthmvn.firstspringapp.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
        Person p = context.getBean(Person.class,"per1");
        System.out.println(p.getSsn()+" "+p.getName());
        System.out.println(p.getAddress().getHno()+" "+p.getAddress().getCity());
        System.out.println(p.getAddress().getState());
        context.close();
        
    }
}
