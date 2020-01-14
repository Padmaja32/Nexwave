import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCount 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ObjDriver = new ChromeDriver();
	ObjDriver.get("http://demo.opencart.com");
	List<WebElement> Links=ObjDriver.findElements(By.tagName("a"));
	//a Link will go with Href
	//ing will go with src
	System.out.println("Number of images"+ Links.size());
	System.out.println("Number of links"+ Links.size());
	for(WebElement ele:Links)
	{
		System.out.println(ele.getAttribute("href"));
	}
	ObjDriver.close();
	}

}
