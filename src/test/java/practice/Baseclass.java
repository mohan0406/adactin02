package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Baseclass {
WebDriver driver;

public void luchbrowser() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\practice\\driver\\chromedriver.exe");

}
public void username(WebElement e,String s) {
	// TODO Auto-generated method stub
	e.sendKeys(s);
}
public void password(WebElement e,String s) {
	// TODO Auto-generated method stub
e.sendKeys(s);
}
public void btnclick(WebElement e) {
	// TODO Auto-generated method stub
e.click();
}
	public Baseclass() {
		
	this.driver=driver;
	//PageFactory.initElements(driver, this);
	}
}
