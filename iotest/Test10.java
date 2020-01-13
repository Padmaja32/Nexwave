package iotest;

class Employee implements java.io.Serializable {
	private int empid;
	private String ename;
	private double salary;
	public Employee() {}
	public Employee(int empid, String ename, double sal) {
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}