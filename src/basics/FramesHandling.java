package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/SSTS/dharani/selenium_workspace/selenium_basics/frames/framesDemo.html");
		driver.manage().window().maximize();

		/*
		 * frames are used to display the web page with in a web page To work with
		 * frames we have to switch focus from web driver to that particular frame we
		 * can switch to frames using frame index or frame id or name or frame element
		 */

		// locate all the frames inside the page
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@src = 'frameThree.html']"));
		
		// automate the content in frame 4
		//switch to frame 3 from main page
		driver.switchTo().frame(frame3);
		//switch to frame 4 which is in frame 3
		driver.switchTo().frame(0);
		//now we are in frame 4
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search')]")).sendKeys("python");
		Thread.sleep(4000);
		
		//now focus is in frame 4
		//we want to automate frame 2
		//switch focus to main page
		driver.switchTo().defaultContent();
		//now focus in main page
		driver.switchTo().frame("ftwo");
		//now focus is in frame 2
		driver.findElement(By.partialLinkText("selenium")).click();
		Thread.sleep(2000);
		
		//now focus is in frame 2
		// we want to automate frame 3
		//swithc focus to main page
		driver.switchTo().defaultContent();
		//switch focus to frame 3
		driver.switchTo().frame("fthree");
		//now focus is in frame 3
		driver.findElement(By.id("click")).click();
		Thread.sleep(2000);
		
		//now focus is in frame 3
		//we want to automate frame 1
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@placeholder = 'Enter name']")).sendKeys("selenium");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
