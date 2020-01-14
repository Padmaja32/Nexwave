
import java.util.Scanner;
public class SecondWeb
{
	public static void main(String[] args) {
		int ch;
		Scanner s = new Scanner(System.in);
		MyOpenCart m =new MyOpenCart();
		MyRegistration n = new MyRegistration();
		System.out.println("SELECT YOUR WEBSITE");
		System.out.println("1.OpenCart.com 2.Automation Registration");
		ch = s.nextInt();
		if(ch ==1)
			m.openCart();
		if(ch == 2)
			n.openRegistration();
	
			
	}
}
