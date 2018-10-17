package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/surya/Documents/selenium/softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		/*
		 * to work with multiple windows we have to get window handles first and 
		 * store in an array, index 0 of that array represents the parent window
		 * index 1 represents the first child window, index 2 represents the 2nd 
		 * child window and so on 
		 */
		//get the window  handles and store in an array
		
		//switch to first child window
		
		//switch to second child window
		
		//switch to third child window
		
		//switch back to parent window
		
		//close all the browser windows
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
