import java.sql.Date;
import java.util.ArrayList;

public class DAOMain {
	public static void main(String[] args) {
		/*Employee e = new Employee(103, "chandu",1100,new Date(1990,3,12));
		EmployeeDAO edao = new EmployeeDAO();
		if (edao.modifyEmployee(e)) {
			System.out.println("Employee Record Modified");
		}
		else
			System.out.println("Modification Failed");
		
		EmployeeDAO edao = new EmployeeDAO();
		ArrayList<Employee> elist = edao.getEmployee();
		for(Employee e : elist)
			System.out.println(e.getEmpid()+" "+e.getName());
		
		EmployeeDAO edao = new EmployeeDAO();
		Employee e = edao.getEmployee(103);
		if(e!=null)
			System.out.println(e.getEmpid()+" "+e.getName());
		else
			System.out.println("Employee with id 103 does not exist");*/
		
		EmployeeDAO edao = new EmployeeDAO();
		if(edao.removeEmployee(103))
			System.out.println("Employee deleted successfully");
		else
			System.out.println("EMployee with id 103 does not exist");
		
	}

}
