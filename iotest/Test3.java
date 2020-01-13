package iotest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Test3 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("D:/abc1.txt");
			for(int i=65;i<90;i++)
				fos.write(i);
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		finally {
			try
			{
				if(fos!=null)
					fos.close();
			}
			catch(IOException ex1) {
				System.out.println(ex1);
			}
		}
		
		/* try(FileOutputStream fos = new FileOutputStream("abc1.dat"))
		 * {
		 * 		for(int i=65;i<90;i++)
				fos.write(i);
				}
			catch(IOEception ex1){
				System.out.println(ex);
			}
				*/
	}

}
