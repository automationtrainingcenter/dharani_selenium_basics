package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/surya/Documents/selenium/softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		/*
		 * alerts are javascript popups, without handling these alerts 
		 * we can't perform any actions on the web page
		 */
		//to handle alerts, first we have to switch focus fromm web driver to alert
		
		//click ok button on alert
		
		//get the alert message
		
		//click cancel button on alert
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
