package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test(groups="Retesting")
	public void bton() {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\practice\\driver\\chromedriver.exe");
				WebDriver  driver=new ChromeDriver();
				  driver.get("https://www.adactin.com/HotelApp/");
}}
