package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement shopByCat = driver.findElement(By.id("nav-link-shopall"));
		WebElement mobilesAndElec = driver.findElement(By.xpath("//span[contains(text(),'Mobiles, Computers')]"));
		WebElement powerBank =  driver.findElement(By.xpath("//span[contains(text(),'Power Banks')]"));
		
		//create an object of Actions class by passing driver as an argument
		Actions action = new Actions(driver);
		action.moveToElement(shopByCat).build().perform();
		Thread.sleep(2000);
		action.moveToElement(mobilesAndElec).build().perform();
		Thread.sleep(2000);
		action.moveToElement(powerBank).click().build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
