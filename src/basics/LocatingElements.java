package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		/*
		 * findElement() -> is used to locate an element in the web page using locator
		 * information. If the element is not located using the given locator info this
		 * method throws ElementNotFound exception.
		 */

		/*
		 * findElements() -> is used to locate multiple elements in the web page using
		 * locator information. This method return a list of elements. if no element is
		 * not located then this method returns an empty list.
		 */

		// selenium provides 8 ways to locate elements in By class
		// id -> By.id() locates element uniquely using id attribute of the element
//		By arg = By.id("u_0_j");
//		driver.findElement(arg);

		WebElement firstname = driver.findElement(By.id("u_0_j"));
		// name -> By.name() locates element uniquely using name attribute of the
		// element
		WebElement lastname = driver.findElement(By.name("lastname"));
		// linkText -> By.linkText() locates links(anchor tags) with text of the link
		WebElement forgot_password = driver.findElement(By.linkText("Forgotten account?"));
		// partialLinkText -> By.partialLinkText() locates links(anchor tags) with
		// partial text of the link
		WebElement ydob = driver.findElement(By.partialLinkText("Why do I need"));
		// xpath -> By.xpath() locates element using xpath(XML path) of the element
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id='u_0_o']"));
		// cssSelector -> By.cssSelector() locates element using css selector of the
		// element
		WebElement password = driver.findElement(By.cssSelector("#u_0_v"));
		// className -> By.className() locates element using class name the of the
		// element
		List<WebElement> radioButtons = driver.findElements(By.className("_58mt"));
		System.out.println(radioButtons.size());
		// tagName -> By.tagName() locates element by it's tag name
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		/*
		 * There is a high probability of locating multiple elements by using class name
		 * and tag name
		 */
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
