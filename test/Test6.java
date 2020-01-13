package test;
import java.util.*;
import java.io.*;
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 

public class Test6 {
	
	static void enterAge( ) {
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age");
		try {
			age = s.nextInt();
			if(age<1 || age>110) {
				throw new MyException("Age must be between 1-110");
			}
			else 
				System.out.println("Age Accepted");
		}
		catch (MyException ex) {
			System.out.println("Exception Caught");
            System.out.println(ex.getMessage());
            
		}
		finally {
			System.out.println("enterAge() Method Execution completed");
		
	}
	}

	public static void main(String args[]) throws IOException {
		int a=0;
		int b=10;
		FileWriter file = new FileWriter("D:\\Data1.txt");
	    file.write("Ashraful created this file");
		try {
			System.out.println("dividing b by a");
			int c = b/a;
		}
		catch(ArithmeticException e) {
			System.out.println("You can not divide by a. value of a is Zero");
		}
		try {
			enterAge();
		}
			
		finally {
			file.close();
			System.out.println("Your program will be terminated now");
		}
	}
}
