package iotest;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;

public class Test9 {
	public static void main(String[] args) {
		try(FileInputStream file = new FileInputStream("D:/abc4.txt");
				BufferedInputStream bfile = new BufferedInputStream(file)) {
			int ch;
			while((ch=bfile.read())!=-1) {
				System.out.print((char)ch+" ");
			}
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
