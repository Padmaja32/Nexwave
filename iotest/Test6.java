package iotest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;

public class Test6 {
	public static void main(String[] args) {
		try(FileOutputStream file = new FileOutputStream("D:/abc5.txt");
				DataOutputStream dfile = new DataOutputStream(file);) {
			int i = 832;
			float f = 98.93F;
			Double d = 8192.984;
			dfile.writeInt(i);
			dfile.writeFloat(f);
			dfile.writeDouble(d);
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
