package iotest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test12 {
	public static void main(String[] args)  {
		
		Employee e = null;
		try(FileInputStream file = new FileInputStream("D:/emp.txt");
				ObjectInputStream ofile = new ObjectInputStream(file)) {
			e = (Employee)ofile.readObject();
			System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
			
		}
		catch(IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}

}
