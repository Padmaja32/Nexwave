package MyTest;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test5 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Welcome");
		list.add("Hello");
		list.add("Farewell");
		list.add("Zebra");
		

		list.add(1,"banana");
		for(String s2: list)
			System.out.println(s2);

		System.out.println(list.get(1));

		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
