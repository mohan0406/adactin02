package com.adactingpom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @Created by mohan
 * @Created on 12/29/2019
 * @author user
 *
 */
public class RegisterHotelPage extends BaseClass {
	public RegisterHotelPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@FindBy(id="first_name")
	private List<WebElement> fn;
	@FindBy(id="last_name")
	private List<WebElement> ln;
	@FindBy(id="address")
	private List<WebElement> addrs;
	@FindBy(id="cc_num")
	private List<WebElement> ccn;
	@FindBy(id="cc_type")
	private List<WebElement> ccntype;
	@FindBy(id="cc_exp_month")
	private List<WebElement> xpmonth;
	@FindBy(id="cc_exp_year")
	private List<WebElement> xpyear;
	@FindBy(id="cc_cvv")
	private List<WebElement> ccv;
	@FindBy(id="book_now")
	private List<WebElement> book;
	public List<WebElement> getFn() {
		return fn;
	}
	public List<WebElement> getLn() {
		return ln;
	}
	public List<WebElement> getAddrs() {
		return addrs;
	}
	public List<WebElement> getCcn() {
		return ccn;
	}
	public List<WebElement> getCcntype() {
		return ccntype;
	}
	public List<WebElement> getXpmonth() {
		return xpmonth;
	}
	public List<WebElement> getXpyear() {
		return xpyear;
	}
	public List<WebElement> getCcv() {
		return ccv;
	}
	public List<WebElement> getBook() {
		return book;
	}
}
