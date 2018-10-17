package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();

		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		/*
		 * alerts are javascript popups, without handling these alerts we can't perform
		 * any actions on the web page
		 */
		// get the alert message
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		// to handle alerts, first we have to switch focus from web driver to alert
		// click ok button on alert
		driver.switchTo().alert().accept();

		// click on confirm button which will open an alert with both ok and cancel
		// buttons
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		// get the text of the alert before clicking on cancel button
		alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		if (alerttext.contains("corfirm")) {
			// click cancel button on alert
			driver.switchTo().alert().dismiss();
		}else {
			driver.switchTo().alert().accept();
		}

		driver.findElement(By.id("hondacheck")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
