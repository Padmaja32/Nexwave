package MyTest;
import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int i;
			String ss;
			System.out.println("Enter a number");
			i=s.nextInt();
			s.nextLine();
			System.out.println("Enter a string");
			ss = s.nextLine();
			System.out.println("YOU HAVE ENTERED");
			System.out.print(i+" ");
			System.out.print(ss);
		}
		

	}

}
