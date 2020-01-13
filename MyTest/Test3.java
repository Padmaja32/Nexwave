package MyTest;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee1>{
	private int empid;
	private String ename;
	private double salary;
	
	public Employee1(int empid, String ename, double sal) {
		this.empid = empid;
		this.ename = ename;
		this.salary = sal;
	}
	public int compareTo(Employee1 e) {
		return empid-e.empid;
	}
	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}
public class Test3 {
	
	public static void main(String args[]) {
		TreeSet<Employee1> tset = new TreeSet<>();
		tset.add(new Employee1(102,"Ajay",25000));
		tset.add(new Employee1(101,"Vijay",35000));
		for(Employee1 s : tset)
			System.out.println(s);
	}

}
