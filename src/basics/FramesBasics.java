package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesBasics {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		//now the focus is in main window
		driver.findElement(By.id("displayed-text")).sendKeys("dharani");
		Thread.sleep(2000);
		
		//switch focus to frame
		//way 1
		driver.switchTo().frame(0);
		driver.findElement(By.id("search-courses")).sendKeys("python");
		Thread.sleep(2000);
		//focus is in frame so switch back to main window using defaultContent()
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("dharani");
		Thread.sleep(2000);
		driver.close();
	}

}
