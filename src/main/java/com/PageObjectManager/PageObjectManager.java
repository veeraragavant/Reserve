package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.Locators.HomePage;
import com.Locators.LoginPage;

public class PageObjectManager extends BaseClass{

	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	private LoginPage loginpage;

	public LoginPage getLoginpage() {
		if (loginpage==null) {
			loginpage=new LoginPage(driver);
		}
		return loginpage;
	}
	
	private HomePage homepage;

	public HomePage getHomepage() {
		if (homepage==null) {
			homepage=new HomePage(driver);
		}
		return homepage;
	}

	
}
