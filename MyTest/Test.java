package MyTest;

import java.util.LinkedHashSet;


class Employee5 {
	private int empid;
	private String ename;
	private double salary;
	
	public Employee5(int empid, String ename, double sal) {
		this.empid = empid;
		this.ename = ename;
		this.salary = sal;
	}

	@Override
	public String toString() {
		return "Employee5 [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
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
		Employee5 other = (Employee5) obj;
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
	
}

public class Test {
	public static void main(String main[]) {
		LinkedHashSet<Employee5> hs = new LinkedHashSet<Employee5>();
		hs.add(new Employee5(102,"Ajay",25000));
		hs.add(new Employee5(101,"Vijay",35000));
		for(Employee5 s : hs)
			System.out.println(s);
		System.out.println(hs.add(new Employee5(101,"Ajay",25000)));
		for(Employee5 s : hs)
			System.out.println(s);
	}
	//LinkedHashSet can be used to retrieve the elements in order

}
