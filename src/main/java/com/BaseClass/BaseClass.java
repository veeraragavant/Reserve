package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	public static void BrowserLaunch(String browser) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Reservation\\src\\test\\resources\\com\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		    else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Reservation\\src\\test\\resources\\com\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		    }
		}
	
	public static void windowmax() {	
		driver.manage().window().maximize();	
	}
	
	
	public static void weburl(String url) {
		driver.get(url);
	}
	
	
	public static void elementclick(WebElement element) {
	element.click();
	}
	
	public static void elementsend(WebElement element, String value) {
		element.sendKeys(value);	
	}
	
	public static boolean elementdisplayed(WebElement element) {
		
		boolean display = false;
		try {
			display = element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Element not Displayed "+e.getMessage());
		}
		return display;
			
	}
	
public static String getthetext(WebElement element) {
	String text = null;
	try {
		text=element.getText();
	} catch (Exception e) {
		System.out.println("Text not Derived "+e.getMessage());
	}
	return text;
}

public static void dropdowns(WebElement element, int value) {

	Select select = new Select(element);
	select.selectByIndex(value);
	
}

public static void back() {
	driver.navigate().back();
	driver.getTitle();
}

public static void front() {
	driver.navigate().forward();
	driver.getTitle();
}

}
	
	
	

