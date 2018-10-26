package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableNSE {
	public static void main(String[] args) throws InterruptedException {
		String companyId = "HDFC";
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/live_market/dynaContent/live_watch/pre_open_market/pre_open_market.htm");
		driver.manage().window().maximize();

		WebElement table_body = driver.findElement(By.cssSelector("#preOpenNiftyTab>tbody"));
		List<WebElement> rows = table_body.findElements(By.tagName("tr"));
		for (int i = 2; i < rows.size(); i++) {
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			if(cells.get(0).getText().equals(companyId)) {
				System.out.println(cells.get(3).getText());
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
