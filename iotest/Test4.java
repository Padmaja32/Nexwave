package iotest;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Test4 {
	public static void main(String[] args) {
		try(FileInputStream file = new FileInputStream("D:/abc1.txt")) {
			int ch;
		while((ch=file.read())!=-1)
			System.out.print((char)ch+" ");	
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
