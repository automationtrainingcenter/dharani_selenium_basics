package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownList {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/surya/Documents/selenium/softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		/*
		 * Selenium provides a class "Select" to handle drop down list or list boxes
		 * which are implemented using the select tag of html
		 */
		
		//create select class object
		
		//selectByVisibleText -> selects an option of the drop down list using the visible text or inner text
		
		
		//selectByValue -> selects an option of the drop down list using the value of the value attribute
		
		
		//selectByIndex -> selects an option of the drop down list using the index number of the option
		
		//isMultiple -> returns true if we are able to select multiple elements of a list box
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
