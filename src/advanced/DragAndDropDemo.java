package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//swtich to frame in which drag and drop elements are present
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'droppable')]")));
		
		
		WebElement dragELe = driver.findElement(By.id("draggable"));
		WebElement dropEle = driver.findElement(By.id("droppable"));
		
		
		
		Actions action = new Actions(driver);
		//way 1
//		action.clickAndHold(dragELe).moveToElement(dropEle).release().build().perform();
		
		//way 2
		action.dragAndDrop(dragELe, dropEle).build().perform();
		
		Thread.sleep(4000);
		driver.close();
	}

}
