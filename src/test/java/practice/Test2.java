package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Test(groups="sanity")
	public void bton() {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\practice\\driver\\chromedriver.exe");
				WebDriver  driver=new ChromeDriver();
				  driver.get("https://www.adactin.com/HotelApp/");
	}
	@Test(groups="Retesting")
	public void create() {
		// TODO Auto-generated method stub
System.out.println("123456789");
	}
}
