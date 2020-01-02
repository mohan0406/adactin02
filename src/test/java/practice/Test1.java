package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
WebDriver driver;

	@Test(groups="smoke")
	public void login() {
		// TODO Auto-generated method stub
	//if(s1.equals("chrome"))	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\practice\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.adactin.com/HotelApp/");
		  driver.findElement(By.xpath("//*[@id='username']")).sendKeys("dfghjkl");
		  driver.findElement(By.xpath("//*[@id='username']")).clear();
	}
//	@Test
//	public void login1() {
//		// TODO Auto-generated method stub
//
//	}
	
}
