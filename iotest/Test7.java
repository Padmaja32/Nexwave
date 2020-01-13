package iotest;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileNotFoundException;

public class Test7 {
	public static void main(String[] args) {
		try(FileInputStream file = new FileInputStream("D:/abc5.txt");
				DataInputStream dfile = new DataInputStream(file);) {
			int i = dfile.readInt();
			float f = dfile.readFloat();
			Double d = dfile.readDouble();
			System.out.println(i);
			System.out.println(f);
			System.out.println(d);
			
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}