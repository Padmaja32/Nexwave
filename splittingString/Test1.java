package splittingString;

public class Test1 {
	public static void main(String args[]) {
		String s = "Something to be,written and shown,to the lecturer";
		String[] s1 = s.split(",");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}

}
