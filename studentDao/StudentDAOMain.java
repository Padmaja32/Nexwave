package studentDao;

import java.sql.Date;
import java.util.ArrayList;

public class StudentDAOMain {
	public static void main(String[] args) {
		/*Student s = new Student(1,"Raju",10,new Date(2010,3,12));
		StudentDAO sdao = new StudentDAO();
		if(sdao.insertStudent(s))
			System.out.println("Inserted Successfully");
		else
			System.out.println("insertion failed");*/
		
		StudentDAO sdao = new StudentDAO();
		ArrayList<Student> slist = sdao.getStudent();
		for(Student i : slist)
			System.out.println(i.getRno()+" "+i.getName());
		
	}
	
	

}
