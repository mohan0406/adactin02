package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\practice\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("google.com");
	}
	
	
}
