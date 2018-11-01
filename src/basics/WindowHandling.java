package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	static WebDriver driver;

	public static void windows(String title) throws InterruptedException {
		Thread.sleep(2000);
		if (title.contains("Google")) {
			driver.findElement(By.name("q")).sendKeys("selenium wiht python" + Keys.ENTER);

		} else if (title.contains("YouTube")) {
			driver.findElement(By.name("search_query")).sendKeys("selenium");
		} else if (title.contains("Facebook")) {
			driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
		} else if (title.contains("Frames")) {
			driver.findElement(By.id("opentTab")).click();
		}
		Thread.sleep(4000);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/SSTS/dharani/selenium_workspace/selenium_basics/frames/framesDemo.html");
		driver.manage().window().maximize();

		/*
		 * to work with multiple windows we have to get window handles first and store
		 * in an array, index 0 of that array represents the parent window index 1
		 * represents the first child window, index 2 represents the 2nd child window
		 * and so on
		 */

		// locate element which will open multiple windows and click on it
		driver.findElement(By.id("opentWin")).click();
		Thread.sleep(5000);
		// get the window handles and store in an array
		Object[] array = driver.getWindowHandles().toArray();
		// switch to first child window
		driver.switchTo().window(array[1].toString());
		String title = driver.getTitle();
		windows(title);
		// switch to second child window
		driver.switchTo().window(array[2].toString());
		title = driver.getTitle();
		windows(title);
		// switch to third child window
		driver.switchTo().window(array[3].toString());
		title = driver.getTitle();
		windows(title);

		// switch back to parent window
		driver.switchTo().window(array[0].toString());
		title = driver.getTitle();
		windows(title);
		// close all the browser windows
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
