package test;

import java.util.Arrays;

class Employee1 {
	private int empid;
	private String ename;
	private double salary;
	
	public Employee1(int empid, String ename, double sal) {
		this.empid = empid;
		this.ename = ename;
		this.salary = sal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSal(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

class Department1 {
	private int Dno;
	private String Dname;
	Employee1[] e;
	public Department1(int dno, String dname, Employee1[] e) {
		super();
		Dno = dno;
		Dname = dname;
		this.e = e;
	}
	public int getDno() {
		return Dno;
	}
	public void setDno(int dno) {
		Dno = dno;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public Employee1[] getE() {
		return e;
	}
	public void setE(Employee1[] e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Department [Dno=" + Dno + ", Dname=" + Dname + ", e=" + Arrays.toString(e) + "]";
	}
	
	
}
public class Test2 {
	public static void main(String args[]) {
		Employee1[] e = new Employee1[2];
		e[0] = new Employee1(101,"Ajay",25000);
		e[1] = new Employee1(102,"Vijay",30000);
		Department1 d1 = new Department1(10,"Sales",e);
		System.out.println(d1);
		
	}
}
