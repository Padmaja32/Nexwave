package iotest;

import java.io.File;

public class Test2 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("D:/abc.txt");
		System.out.println(file.createNewFile());
	}

}
