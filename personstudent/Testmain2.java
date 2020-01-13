package personstudent;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Testmain2 {
	public static void main(String[] args)  {
		
		Student e = null;
		try(FileInputStream file = new FileInputStream("D:/per.txt");
				ObjectInputStream ofile = new ObjectInputStream(file)) {
			e = (Student)ofile.readObject();
			System.out.println(e.getSsn()+" "+e.getName()+" "+e.getAge()+" "+e.getRno());
			
		}
		catch(IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}

}
