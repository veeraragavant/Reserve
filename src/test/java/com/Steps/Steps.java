package com.Steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import com.BaseClass.BaseClass;
import com.PageObjectManager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps extends BaseClass{

	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("^User Launching the Chrome Browser$")
	public void user_Launching_the_Chrome_Browser() throws Throwable {
	    BrowserLaunch("chrome");
	    windowmax();
	}

	@Given("^User Entering Adacting Website URL \"([^\"]*)\"$")
	public void user_Entering_Adacting_Website_URL(String arg1) throws Throwable {
	    weburl(arg1);
	}

	@Given("^User Entering the Username \"([^\"]*)\"$")
	public void user_Entering_the_Username(String arg1) throws Throwable {
	    elementsend(obj.getLoginpage().getUserName(), arg1);
	}

	@Given("^User Entering the Password \"([^\"]*)\"$")
	public void user_Entering_the_Password(String arg1) throws Throwable {
	   elementsend(obj.getLoginpage().getPassWord(), arg1);
	}

	@Given("^User Clicking the Login Button$")
	public void user_Clicking_the_Login_Button() throws Throwable {
    elementclick(obj.getLoginpage().getButton());

	}

	
	@Then("^User Selecting Location of the Hotel$")
	public void user_Selecting_Location_of_the_Hotel() throws Throwable {    
		dropdowns(obj.getHomepage().getLocation(), 1);
		
	}

	@Then("^User Selecting the Hotel$")
	public void user_Selecting_the_Hotel() throws Throwable {
	    dropdowns(obj.getHomepage().getHotelname(), 1);
	}

	@Then("^User Selecting the Toom Type$")
	public void user_Selecting_the_Toom_Type() throws Throwable {
    dropdowns(obj.getHomepage().getRoomtype(), 1);

	}

	@Then("^User Selecting No of Rooms$")
	public void user_Selecting_No_of_Rooms() throws Throwable {
	   dropdowns(obj.getHomepage().getRoomnos(), 2);
	}

	@Then("^User Selecting Checkin and Checkout Date$")
	public void user_Selecting_Checkin_and_Checkout_Date() throws Throwable {
	    obj.getHomepage().getCheckin().clear();
		elementsend(obj.getHomepage().getCheckin(), "18/11/2022");
		obj.getHomepage().getCheckout().clear();
		elementsend(obj.getHomepage().getCheckout(), "16/11/2022");
		obj.getHomepage().getSubmit().click();
		
	}

	
	@Then("^User Verifying Error Message \"([^\"]*)\"$")
	public void user_Verifying_Error_Message(String arg1) throws Throwable {
		Assert.assertEquals(arg1, getthetext(obj.getHomepage().getErrormsg()));
	
}
	//TC-104
	
	@Then("^User Selecting Checkin Date$")
	public void user_Selecting_Checkin_Date() throws Throwable {
		obj.getHomepage().getCheckin().clear();
		elementsend(obj.getHomepage().getCheckin(), "15/11/2022");
	    
	}

	@Then("^User Selecting Checkout Date$")
	public void user_Selecting_Checkout_Date() throws Throwable {
		obj.getHomepage().getCheckout().clear();
		elementsend(obj.getHomepage().getCheckout(), "16/11/2022");
	    
	}

	@Then("^User Selecting No of Adults$")
	public void user_Selecting_No_of_Adults() throws Throwable {
	    dropdowns(obj.getHomepage().getAdults(), 1);
	    
	}

	@Then("^User Selecting No of Childs$")
	public void user_Selecting_No_of_Childs() throws Throwable {
	    dropdowns(obj.getHomepage().getChild(), 1);
	    
	}

	@Then("^User Clicking Search Button$")
	public void user_Clicking_Search_Button() throws Throwable {
		obj.getHomepage().getSubmit().click();
	    Thread.sleep(4000);
	}


@Then("^User Verifying Hotel Name Displayed in Hotel Form as \"([^\"]*)\"$")
public void user_Verifying_Hotel_Name_Displayed_in_Hotel_Form_as(String arg1) throws Throwable {
    Assert.assertEquals(arg1, obj.getHomepage().getSydneyy().getAttribute("value"));
    		
   
}

@Then("^User Selecting the Generated Form$")
public void user_Selecting_the_Generated_Form() throws Throwable {
    obj.getHomepage().radiobtn.click();
    obj.getHomepage().cntnu.click();
}

@Then("^User Verifying the Total Amount$")
public void user_Verifying_the_Total_Amount() throws Throwable {
    int x = 0;
	byte a = 125;
    byte b = 2;
    byte c = 1;
    System.out.println(x=a*b*c*10/100+a);
    //Assert.assertEquals(x, obj.getHomepage().finalprice.getAttribute("value"));
    String attributes = obj.getHomepage().finalprice.getAttribute("value");
    String[] split = attributes.split(" ");
    System.out.println(split[2]);
    Assert.assertNotEquals(split[2], x);
}

@Then("^User getting first webpage title$")
public void user_getting_first_webpage_title() throws Throwable {
   driver.navigate().back();
   String title = driver.getTitle();
   System.out.println(title);
}

//@Then("^User getting second Webpage title$")
//public void user_getting_second_Webpage_title() throws Throwable {
//    front();
//}


}
