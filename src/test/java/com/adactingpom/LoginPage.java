package com.adactingpom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class LoginPage extends BaseClass {
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="username")
private List<WebElement> txtuser;
	
@FindBy(id="password")
private List<WebElement> txtpass;

@FindBy(id="login")
private List<WebElement> btnclick;

public List<WebElement> getTxtuser() {
	return txtuser;
}

public List<WebElement> getTxtpass() {
	return txtpass;
}

public List<WebElement> getBtnclick() {
	return btnclick;
}

}
