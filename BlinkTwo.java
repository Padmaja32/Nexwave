import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkTwo
{
	public static void main(String[] args) 
	{	
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/");
	WebElement username = driver.findElement(By.name("search"));
	highlightElement(driver,username);
	}
	public static void highlightElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setattribute('style'," + " 'background: yellow; border: 2px solid red;')",element);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		js.executeScript("argument[0].setAttribute('style','border: solid 2px white');",element);
		
	}

}
