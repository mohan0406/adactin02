package com.base;

import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	/**
	 * @see inisilization driver
	 * @return
	 */
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\practice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	/**
	 * @see property file configuration
	 * @param data
	 * @return
	 */
	public String propertyFileConfig(String data) {
		

		String value = null;
		try {
			Properties property = new Properties();
			property.load(new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties"));
			value = (String) property.get(data);
		//value = (String)p.get(data);
		} catch (Throwable e) {

			e.printStackTrace();
		}

		return value;

	}

	/**
	 * 
	 * @param url
	 */
	public static void loadUrl(String url) {
		driver.get(url);
	}

	/**
	 * 
	 * @param e
	 * @param name
	 */
	public static void send(WebElement element, String name) {
		element.sendKeys(name);

	}

	/**
	 * 
	 */
	public static void dropDown(WebElement element, String str) {
		Select s = new Select(element);
		s.selectByVisibleText(str);
	}

	/**
	 * 
	 * @param e
	 */
	public static void click(WebElement element) {
		// TODO Auto-generated method stub
		element.click();
	}

	/**
	 * 
	 */
	public static void quitBrowser() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	public static String getValueAttribute(WebElement element) {
		// TODO Auto-generated method stub
		return element.getAttribute("value");
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	public static String test(WebElement element) {
		// TODO Auto-generated method stub

		return element.getText();
	
	}
	

	/**
	 * 
	 * @param e
	 */
	public static void MouseOvrAction(WebElement element) {
		Actions acc = new Actions(driver);
		acc.moveToElement(element).perform();
	}
}
