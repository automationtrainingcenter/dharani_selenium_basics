package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("launching browser");
		System.setProperty("webdriver.chrome.driver", "C:\\\\dharani\\\\softwares\\\\drivers\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		Thread.sleep(4000);
		obj.close();
	}

}
