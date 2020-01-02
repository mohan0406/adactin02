package com.pommanager;

import com.adactingpom.*;

/**
 * @see singleton for pom classes
 * @author user
 * @Created by Mohanraj
 * @Created date 12/29/2019
 * 
 */
public class PageObjectManager {

	private LoginPage LoginPage;
	private SearchHotelPages SearchHotelPages;
	private SelectHotelPage SelectHotelPage;
	private RegisterHotelPage RegisterHotelPage;
	private ConfirmPages ConfirmPages;

	/**
	 * 
	 * @return
	 */
	public LoginPage getLoginPage() {
		return (LoginPage == null) ? LoginPage = new LoginPage() : LoginPage;
	}

	/**
	 * 
	 * @return
	 */
	public SearchHotelPages getSearchHotelPages() {
		return (SearchHotelPages == null) ? SearchHotelPages = new SearchHotelPages() : SearchHotelPages;
	}

	/**
	 * 
	 * @return
	 */
	public SelectHotelPage getSelectHotelPage() {
		return (SelectHotelPage == null) ? SelectHotelPage = new SelectHotelPage() : SelectHotelPage;
	}

	/**
	 * 
	 * @return
	 */
	public RegisterHotelPage getRegisterHotelPage() {
		return (RegisterHotelPage == null) ? RegisterHotelPage = new RegisterHotelPage() : RegisterHotelPage;
	}

	/**
	 * 
	 * @return
	 */
	public ConfirmPages getConfirmPages() {
		return (ConfirmPages == null) ? ConfirmPages = new ConfirmPages() : ConfirmPages;
	}

}
