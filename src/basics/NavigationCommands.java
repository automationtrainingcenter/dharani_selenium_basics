package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		//navigate to a url
		driver.navigate().to("http://www.seleniumhq.org");
		Thread.sleep(2000);
		//refresh() 
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//back()
		driver.navigate().back();
		Thread.sleep(2000);
		
		//forward()
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
