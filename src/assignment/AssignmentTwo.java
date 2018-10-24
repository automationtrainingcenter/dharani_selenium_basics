package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Create Date:19-10-2018
 * Create By:Dharani
*/
public class AssignmentTwo {
	/*automate form in toolsqa.com
	 * http://toolsqa.com/automation-practice-form/
	 * do this in firefox browser
	 */
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","E:\\selenium\\softwares\\drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println(" before element");

	//finding element partial link text
	WebElement eLnkTxt= driver.findElement(By.partialLinkText("Partial Link"));
	System.out.println(eLnkTxt.getText());
	eLnkTxt.click();
	Thread.sleep(2000);
	
	//find element link text
	WebElement eLnkTxt1= driver.findElement(By.linkText("Link Test"));
	System.out.println(eLnkTxt1.getText());
	eLnkTxt1.click();
	Thread.sleep(2000);
	System.out.println("page is in another link");
	driver.navigate().back();
	
	//find and fill the firstname
	driver.findElement(By.name("firstname")).sendKeys("Alex");
	Thread.sleep(2000);
	
    //find and fill lastname
	driver.findElement(By.name("lastname")).sendKeys("wilson");
	Thread.sleep(2000);
	
	//fill gender
	driver.findElement(By.id("sex-0")).click();
	
	//fill no. of experience
	driver.findElement(By.id("exp-3")).click();
	
	//fill date
	driver.findElement(By.id("datepicker")).sendKeys("19-10-2018");
	
	//fill profession
	driver.findElement(By.id("profession-0")).click();
	driver.findElement(By.id("profession-1")).click();
	
	//fill Automation tool
	driver.findElement(By.id("tool-1")).click();
	driver.findElement(By.id("tool-2")).click();
	
	
	//select dropdown
	 new Select(driver.findElement(By.id("continents"))).selectByVisibleText("Europe");
	
	//select multiple options in a listbox
	Select elstBox= new Select(driver.findElement(By.id("selenium_commands")));
	elstBox.selectByVisibleText("Browser Commands");
	elstBox.selectByVisibleText("Navigation Commands");
		
	System.out.println("navigation of this practise page is completed");
	Thread.sleep(4000);
	driver.close();
}
}