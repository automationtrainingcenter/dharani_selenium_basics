package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		
		/*
		 * A web page is a combination of many different HTML elements, like images,
		 * buttons, tables, links, labels, forms, edit boxes, paragraphs, dropdown boxes
		 * and so on, these elements are WebElements in the context of WebDriver.
		 */
		//sendKeys -> sendKeys() fills text box or text area with given value
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("dharani");
		
		//clear -> clear() clears the text inside the text box or text area
		Thread.sleep(2000);
		firstname.clear();
		
		//click -> click() clicks on any element
		driver.findElement(By.id("u_0_9")).click();
		Thread.sleep(2000);
		
		//getAttribute -> getAttribute() returns the value of the given attribute
		String attribute = firstname.getAttribute("aria-label");
		System.out.println(attribute);
		
		//getCssValue -> getCssValue() returns the value of the given cssfirs property
		WebElement signup = driver.findElement(By.name("websubmit"));
		String cssValue = signup.getCssValue("background");
		System.out.println("css value "+cssValue);
		
		//getText -> getText() returns the inner text of the element
		System.out.println(signup.getText());
		
		//getTagName -> getTagName() return the tag name of the element
		System.out.println("tag is"+signup.getTagName());
		
		//getLocation -> getLocation() returns the location of the element as Point class object from the top-left corner of the web page
		System.out.println(signup.getLocation());
		
		//getSize -> getSize() returns the size of the element in terms of width of height as Dimension class object
		System.out.println(signup.getSize());
		
		//isDiplayed -> isDisplayed() returns true if an element is visible on the page
		WebElement reenterEmail = driver.findElement(By.name("reg_email_confirmation__"));
		System.out.println("before entering mail id"+reenterEmail.isDisplayed());
		driver.findElement(By.name("reg_email__")).sendKeys("dharani@gmail.com");
		System.out.println("after enterign mail id"+reenterEmail.isDisplayed());
		
		//isElabled -> isEnabled() returns true if an element is enabled on the page
		System.out.println(signup.isEnabled());
		
		//isSelected -> isSelected() returns true if a radio button or check box or list box or drop down button option is selected right now
		System.out.println(driver.findElement(By.id("u_0_a")).isSelected());
		
		//submit -> submit() submit a form to the web server
		driver.findElement(By.id("pass")).submit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
