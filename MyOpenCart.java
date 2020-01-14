import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyOpenCart {
	public void openCart( ) {
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
		System.out.println("Login name " + objprop.getProperty("login1"));
		System.out.println("password "+ objprop.getProperty("pwd1"));
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.opencart.com");
		String var1 = objDriver.getTitle();
		System.out.println("Title of the page "+var1);
		WebElement obj1 = objDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a"));
		obj1.click();
		WebElement obj3 = objDriver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		obj3.sendKeys(objprop.getProperty("login1"));
		WebElement obj4 = objDriver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		obj4.sendKeys(objprop.getProperty("pwd1"));
		WebElement obj5 =objDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/input"));
		obj5.click();
		if(objDriver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).isDisplayed()) {
				System.out.println(objDriver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText());
				objDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")).click();
		}
		objDriver.quit();
	}

}
