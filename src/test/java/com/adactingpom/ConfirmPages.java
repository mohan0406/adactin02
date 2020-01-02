package com.adactingpom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


/**
 * 
 * @author user
 *
 */
public class ConfirmPages extends BaseClass {
	/**
	 * 
	 */
	public ConfirmPages() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//td[@class='login_title']")
	private List<WebElement> order;

	public List<WebElement> getOrder() {
		return order;
	}
}
