package com.adactingpom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class SelectHotelPage extends BaseClass{

	public SelectHotelPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@FindBy(id="radiobutton_0")
	private List<WebElement> radio;
	@FindBy(id="continue")
	private List<WebElement> cnue;
	
	@FindBy(xpath="//td[@class='login_title']")
	private List<WebElement> title;
	public List<WebElement> getRadio() {
		return radio;
	}
	public List<WebElement> getCnue() {
		return cnue;
	}
	public List<WebElement> gettitle() {
		return title;
}}
