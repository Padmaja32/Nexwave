import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyRegistration {
	public void openRegistration() {
		Properties objprop = new Properties();
		try {
			objprop.load(new FileInputStream("D://data2.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Login name " + objprop.getProperty("login2"));
		System.out.println("password "+ objprop.getProperty("pwd2"));
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.automationtesting.in/SignIn.html");
		WebElement obj1 = objDriver.findElement(By.xpath("/html/body/div/div/div[2]/input"));
		obj1.sendKeys(objprop.getProperty("login2"));
		WebElement obj2 = objDriver.findElement(By.xpath("/html/body/div/div/div[3]/input"));
		obj1.sendKeys(objprop.getProperty("pwd2"));
		objDriver.findElement(By.xpath("//*[@id=\"enterbtn\"]")).click();
		if(objDriver.findElement(By.xpath("//*[@id=\"errormsg\"]")).isDisplayed())
			System.out.println(objDriver.findElement(By.xpath("//*[@id=\"errormsg\"]")).getText());
			
		objDriver.quit();
	 }
	

}
