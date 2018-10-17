package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		/*
		 * A web page is a combination of many different HTML elements, like images,
		 * buttons, tables, links, labels, forms, edit boxes, paragraphs, dropdown boxes
		 * and so on, these elements are WebElements in the context of WebDriver.
		 */
		
		//click -> click() clicks on any element
		
		//sendKeys -> sendKeys() fills text box or text area with given value
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("dharani");
		//submit -> submit() submit a form to the web server
		
		//clear -> clear() clears the text inside the text box or text area
		Thread.sleep(2000);
		firstname.clear();
	
		//getAttribute -> getAttribute() returns the value of the given attribute
		
		//getCssValue -> getCssValue() returns the value of the given cssfirs property
		
		//getText -> getText() returns the inner text of the element
		
		//getTagName -> getTagName() return the tag name of the element
		
		//getLocation -> getLocation() returns the location of the element as Point class object from the top-left corner of the web page
		
		//getSize -> getSize() returns the size of the element in terms of width of height as Dimension class object
		
		//isDiplayed -> isDisplayed() returns true if an element is visible on the page
		
		//isElabled -> isEnabled() returns true if an element is enabled on the page
		
		//isSelected -> isSelected() returns true if a radio button or check box or list box or drop down button option is selected right now
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
