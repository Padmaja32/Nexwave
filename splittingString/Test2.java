package splittingString;

import java.util.StringTokenizer;

public class Test2 {
	public static void main(String args[]) {
		String s = "Something to be,written and shown,to the lecturer";
		StringTokenizer st = new StringTokenizer(s,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
