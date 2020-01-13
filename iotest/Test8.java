package iotest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;

public class Test8 {
	public static void main(String[] args) {
		try(FileOutputStream file = new FileOutputStream("D:/abc4.txt");
				BufferedOutputStream bfile = new BufferedOutputStream(file)) {
			for(int i=65;i<=90;i++) {
				bfile.write(i);
			}
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
