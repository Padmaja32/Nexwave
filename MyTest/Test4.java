package MyTest;

import java.util.ArrayList;
import java.util.ListIterator;

import java.util.Scanner;
public class Test4 {
	public static void main(String args[]) {
		ArrayList<String> alist = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		String s1;
		for(int i=0;i<5;i++) {
			s1=s.next();
			alist.add(s1);
		}
		

		alist.add(1,"banana");
		for(String s2: alist)
			System.out.println(s2);

		System.out.println(alist.get(1));

		ListIterator<String> itr = alist.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
