package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		/*
		 * Selenium provides a class "Select" to handle drop down list or list boxes
		 * which are implemented using the select tag of html
		 */
		
		//create select class object
		Select day = new Select(driver.findElement(By.id("day")));
		
		//get the first selected option
		System.out.println(day.getFirstSelectedOption().getText());
		
		//selectByVisibleText -> selects an option of the drop down list using the visible text or inner text
		day.selectByVisibleText("18");
		Thread.sleep(2000);
		
		//selectByIndex -> selects an option of the drop down list using the index number of the option
		new Select(driver.findElement(By.id("month"))).selectByIndex(11);
		Thread.sleep(2000);
		//selectByValue -> selects an option of the drop down list using the value of the value attribute
		new Select(driver.findElement(By.id("year"))).selectByValue("2006");
		Thread.sleep(2000);
		//isMultiple -> returns true if we are able to select multiple elements of a list box
		System.out.println(day.isMultiple());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
