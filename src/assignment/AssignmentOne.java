package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * Create Date:18-10-2018
 * Create By:Dharani
*/
public class AssignmentOne {
	public static void main(String[] args) throws InterruptedException {
		
	/*automate the below link
	 * https://learn.letskodeit.com/p/practice
	 * do this in chrome browser
	 * check boxes
	 * radio buttons
	 * buttons
	 * alerts
	 * frames
	 * dropdown list
	 * list box
	 */
	System.setProperty("webdriver.chrome.driver",
			"C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://learn.letskodeit.com/p/practice");
	driver.manage().window().maximize();
	
	//selecting the radio button options
	WebElement eRdBtn= driver.findElement(By.id("benzradio"));
	eRdBtn.click();
	Thread.sleep(2000);
	
	//selecting dropdown option
	new Select(driver.findElement(By.id("carselect"))).selectByValue("honda");
	Thread.sleep(2000);
	
	//select multiple options in a listbox
	Select elstBox= new Select(driver.findElement(By.id("multiple-select-example")));
	elstBox.selectByValue("apple");
	elstBox.selectByValue("orange");
	
	//select option in checkbox
	 WebElement eCkBox= driver.findElement(By.id("bmwcheck"));
	 eCkBox.click();
	 Thread.sleep(2000);
	 
	 //alert button
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	//operations with frames
	driver.switchTo().frame(0);
	driver.findElement(By.id("search-courses")).sendKeys("java");
	Thread.sleep(2000);
	
	//switching to main page
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("displayed-text")).sendKeys("show hide text");
	Thread.sleep(2000);
	
	//buttons
	driver.findElement(By.id("hide-textbox")).click();
	Thread.sleep(2000);
		
	driver.findElement(By.id("show-textbox")).click();
	Thread.sleep(2000);
			
	//closing browser
	driver.close();
	
}
}

