import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioOne 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ObjDriver = new ChromeDriver();
	ObjDriver.get("http://demo.automationtesting.in/Register.html");
	WebElement radio_Button=ObjDriver.findElement(By.name("radiooptions"));
	boolean status=radio_Button.isDisplayed();
	System.out.println("radio button id displayed >>"+status);
	boolean enabled_status=radio_Button.isEnabled();
	System.out.println("radio button id Enabled >>"+enabled_status);
	boolean selected_status=radio_Button.isSelected();
	System.out.println("radio button id Enabled >>"+selected_status);
	boolean selected_status_new=radio_Button.isSelected();
	System.out.println("radio button id Selected >>"+selected_status_new);
	
	}

}
