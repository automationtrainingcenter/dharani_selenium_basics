package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowsers {
	WebDriver obj;
	
	public void launchChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		obj = new ChromeDriver();
		obj.get("http://www.google.com");
		Thread.sleep(2000);
		obj.close();
	}
	
	public void launchFirefox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwares\\drivers\\geckodriver.exe");
		obj = new FirefoxDriver();
		obj.get("http://www.facebook.com");
		Thread.sleep(2000);
		obj.close();
	}
	
	
	public void launchEdge() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\selenium\\softwares\\drivers\\MicrosoftWebDriver.exe");
		obj = new EdgeDriver();
		obj.get("http://seleniumhq.org");
		Thread.sleep(2000);
		obj.close();
	}
	
	public static void main(String[] args) throws Exception{
		MultiBrowsers bObj = new MultiBrowsers();
		bObj.launchChrome();
		bObj.launchFirefox();
		bObj.launchEdge();
	}

}
