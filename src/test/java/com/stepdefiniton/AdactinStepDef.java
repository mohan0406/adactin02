package com.stepdefiniton;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.base.BaseClass;

import com.pommanager.PageObjectManager;
import io.cucumber.java.en.*;

/**
 * @see Stepdefinition for adactin
 * @author user
 * @Created by Mohanraj
 * @Created date 12/29/2019
 */
public class AdactinStepDef extends BaseClass {
	PageObjectManager pageObject;

	/**
	 * 
	 */
	@Given("user is on adaction home page")
	public void user_is_on_adaction_home_page() {
	}

	/**
	 * 
	 * @param s1
	 * @param s2
	 */
	@When("user enter the {string}, {string} and click the login button")
	public void user_enter_the_and_click_the_login_button(String username, String s2) {
		pageObject = new PageObjectManager();
		WebElement t = pageObject.getLoginPage().getTxtuser().get(0);
		send(t, propertyFileConfig(username));
		Assert.assertEquals(propertyFileConfig(username), getValueAttribute(t), "verified");
		WebElement s = pageObject.getLoginPage().getTxtpass().get(0);
		send(s, s2);
		Assert.assertEquals(s2, getValueAttribute(s), "verified");
		click(pageObject.getLoginPage().getBtnclick().get(0));

	}

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @param s3
	 * @param s4
	 * @param s5
	 * @param s6
	 * @param s7
	 * @param s8
	 */
	@When("user is on home page select{string},{string},{string},{string},{string},{string},{string},{string} hit the search button")
	public void user_is_on_home_page_select_hit_the_search_button(String location, String hotel, String room,
			String noroom, String checkIn, String checkOut, String adult, String child) {
		Assert.assertTrue(driver.getCurrentUrl().contains("SearchHotel"), "verified");
		dropDown(pageObject.getSearchHotelPages().getLocat().get(0), location);
		dropDown(pageObject.getSearchHotelPages().getHtl().get(0), hotel);
		dropDown(pageObject.getSearchHotelPages().getRoom().get(0), room);
		dropDown(pageObject.getSearchHotelPages().getNoroom().get(0), noroom);
		send(pageObject.getSearchHotelPages().getCin().get(0), checkIn);
		send(pageObject.getSearchHotelPages().getCout().get(0), checkOut);
		dropDown(pageObject.getSearchHotelPages().getAdult().get(0), adult);
		WebElement noOfAdult = pageObject.getSearchHotelPages().getChild().get(0);
		dropDown(noOfAdult, child);

		click(pageObject.getSearchHotelPages().getSrch().get(0));
	}

	/**
	 * 
	 */
	@When("select the hotel and click the continue button")
	public void select_the_hotel_and_click_the_continue_button() {
		Assert.assertTrue(driver.getCurrentUrl().contains("SelectHotel"), "verified");
		click(pageObject.getSelectHotelPage().getRadio().get(0));
		click(pageObject.getSelectHotelPage().getCnue().get(0));

	}

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @param s3
	 * @param s4
	 * @param s5
	 * @param s6
	 * @param s7
	 * @param s8
	 */
	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string} click the book now button")
	public void user_enter_the_click_the_book_now_button(String fn, String ln, String addrs, String credit,
			String ccntype, String month, String year, String ccv) {
		pageObject = new PageObjectManager();
		send(pageObject.getRegisterHotelPage().getFn().get(0), fn);
		send(pageObject.getRegisterHotelPage().getLn().get(0), ln);
		send(pageObject.getRegisterHotelPage().getAddrs().get(0), addrs);
		WebElement creditcard = pageObject.getRegisterHotelPage().getCcn().get(0);
		send(creditcard, credit);
		Assert.assertEquals(credit, getValueAttribute(creditcard), "verified");
		dropDown(pageObject.getRegisterHotelPage().getCcntype().get(0), ccntype);
		dropDown(pageObject.getRegisterHotelPage().getXpmonth().get(0), month);
		dropDown(pageObject.getRegisterHotelPage().getXpyear().get(0), year);
		send(pageObject.getRegisterHotelPage().getCcv().get(0), ccv);
		click(pageObject.getRegisterHotelPage().getBook().get(0));
	}

	/**
	 * @see verifiying confirm page
	 */
	@Then("verify the url.")
	public void verify_the_url() {

		WebElement element = pageObject.getConfirmPages().getOrder().get(0);
		System.out.println(element.getText());

	}

}
