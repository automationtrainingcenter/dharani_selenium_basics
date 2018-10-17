package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//get()
		driver.get("http://www.seleniumhq.org");
		
		//getTitle()
		String title = driver.getTitle();
		System.out.println("title  is "+title);
		
		//getCurrentUrl()
		String url = driver.getCurrentUrl();
		System.out.println("url is "+url);
		
		//getPageSource()
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode.contains("SeleniumConf Chicago"));
		
		//getWindowHandle()
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		//getWindowHandles()
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle : windowHandles) {
			System.out.println(handle);
		}
		
		//close()
		driver.close();
		
		//quit()
		driver.quit();
		
		
	}

}
