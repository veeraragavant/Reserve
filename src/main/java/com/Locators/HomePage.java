package com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id = "hotels")
	private WebElement hotelname;
	

	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomnos;
	
	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id = "datepick_in")
	private WebElement checkin;
	
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	
	public WebElement getErrormsg() {
		return errormsg;
	}

	@FindBy(id = "checkin_span")
	private WebElement errormsg;
	
	@FindBy(id = "adult_room")
	private WebElement adults;
	
	@FindBy(id = "child_room")
	private WebElement child;

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}
	
	@FindBy(xpath = "//td[text()='Welcome to Adactin Group of Hotels']")
	private WebElement msgs;

	public WebElement getMsgs() {
		return msgs;
	}
	
	@FindBy(xpath = "//input[@value='Sydney']")
	private WebElement sydneyy;

	public WebElement getSydneyy() {
		return sydneyy;
	}
	@FindBy(id = "arr_date_0")
	private WebElement checksin;

	public WebElement getChecksin() {
		return checksin;
		
	}
	@FindBy(id = "radiobutton_0")
	 public WebElement radiobtn;
	
	@FindBy(id = "continue")
	public WebElement cntnu;
	
	@FindBy(id = "final_price_dis")
	public WebElement finalprice;
}

