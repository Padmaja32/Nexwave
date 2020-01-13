package iotest;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {
	public static void main(String[] args) {
		try(FileWriter file = new FileWriter("D:/abc1.txt",true)) {
			for(int i=97;i<=122;i++) {
				file.write(i);
			}
		}
		catch(IOException ex) {
			System.out.println(ex);		
		}
		
		try(FileReader file1 =  new FileReader("D:/abc1.txt")) {
			int ch;
			while((ch=file1.read())!=-1) {
				System.out.print((char)ch+" ");
			}
		}
		catch(IOException ex1) {
			System.out.println(ex1);
		}
	}
	
	

}
