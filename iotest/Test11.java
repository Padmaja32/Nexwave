package iotest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test11 {
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee(786,"JOhn Miller",25000);
		try(FileOutputStream file = new FileOutputStream("D:/emp.txt");
				ObjectOutputStream ofile = new ObjectOutputStream(file)) {
			ofile.writeObject(e);
			
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
