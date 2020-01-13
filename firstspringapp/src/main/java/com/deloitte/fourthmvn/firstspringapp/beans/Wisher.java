package com.deloitte.fourthmvn.firstspringapp.beans;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Wisher /*implements DisposableBean, InitializingBean*/ {
	String message;

	public Wisher() {
		System.out.println("bean is created");
	}
	

	/*public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("form aps");
		
	}


	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from dest");
		
	}
*/

	public Wisher(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void initWisher() {
		System.out.println("Bean is initialized");
	}
	public void destWisher() {
		System.out.println("bean is about to be destroyed");
	}

}
