package test;

class Employee {
	private int empid;
	private String ename;
	private double salary;
	
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

	public void setSal(double salary) {
		this.salary = salary;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

class Department {
	private int Dno;
	private String Dname;
	Employee e;
	public Department(int dno, String dname, Employee e) {
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
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Department [Dno=" + Dno + ", Dname=" + Dname + ", e=" + e + "]";
	}
	
	
}

public class Test1 {
	public static void main(String args[]) {
		Employee e1 = new Employee(101,"Ajay",25000);
		Employee e2 = new Employee(101,"Ajay",25000);
		System.out.println(e1.equals(e2));
	}

}
