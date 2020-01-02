package com.adactingpom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class SearchHotelPages extends BaseClass {
	public SearchHotelPages() {
		PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
@FindBy(id="location")
private List<WebElement> locat;
@FindBy(id="hotels")
private List<WebElement> htl;
@FindBy(id="room_type")
private List<WebElement> room;
@FindBy(id="room_nos")
private List<WebElement> noroom;
@FindBy(id="datepick_in")
private List<WebElement> cin ;
@FindBy(id="datepick_out")
private List<WebElement> cout;
@FindBy(id="adult_room")
private List<WebElement> adult;
@FindBy(id="child_room")
private List<WebElement> child;
@FindBy(id="Submit")
private List<WebElement> srch;
public List<WebElement> getLocat() {
	return locat;
}
public List<WebElement> getHtl() {
	return htl;
}
public List<WebElement> getRoom() {
	return room;
}
public List<WebElement> getNoroom() {
	return noroom;
}
public List<WebElement> getCin() {
	return cin;
}
public List<WebElement> getCout() {
	return cout;
}
public List<WebElement> getAdult() {
	return adult;
}
public List<WebElement> getChild() {
	return child;
}
public List<WebElement> getSrch() {
	return srch;
}
}
