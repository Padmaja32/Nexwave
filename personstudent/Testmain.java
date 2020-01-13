package personstudent;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Testmain {
	
	public static void main(String[] args) {
		Student e = new Student(1001,"Baron corbin",16,101,60,100,90);
		try(FileOutputStream file = new FileOutputStream("D:/per.txt");
				ObjectOutputStream ofile = new ObjectOutputStream(file)) {
			ofile.writeObject(e);
			
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
