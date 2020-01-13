package iotest;

import java.io.File;
public class Test1 {
	public static void main(String[] args) {
		File file = new File("D:/Test1.java");
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.isDirectory());
		System.out.println(file.canRead());
		System.out.println(file.getName());
		System.out.println(file.canExecute());
		}

}
