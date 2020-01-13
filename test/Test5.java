package test;

class Person3 {
	private int ssn;
	private String name;
	private int age;
	public Person3(int ssn, String name, int age) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Employee3 extends Person3 {
	private int empid;
	private double salary;
	public Employee3(int ssn, String name, int age, int empid, double salary) {
		super(ssn, name, age);
		this.empid = empid;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	}
class SalesMan extends Employee3 {
	int points;

	public SalesMan(int ssn, String name, int age, int empid, double salary, int points) {
		super(ssn, name, age, empid, salary);
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	public double getIncentives() {
		return points*500;
	}
	public double getTotalSalary() {
		return getSalary()+points*500;
	}
	
}
	
public class Test5 {
	public static void main(String args[]) {
		SalesMan s = new SalesMan(1001,"Ajay",28,101,15000,7);
		System.out.println(s.getSsn());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getEmpid());
		System.out.println(s.getSalary());
		System.out.println(s.getPoints());
		System.out.println(s.getIncentives());
		System.out.println(s.getTotalSalary());
		
		
	}

}
