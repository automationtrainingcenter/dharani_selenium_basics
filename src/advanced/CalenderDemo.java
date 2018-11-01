package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {
	
	private static void selectData(WebElement table_body, String date) {
		boolean flag = false;
		List<WebElement> rows = table_body.findElements(By.tagName("tr"));
		for(WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for(WebElement cell : cells) {
				if(cell.getText().endsWith(date)) {
					cell.findElement(By.tagName("button")).click();
					flag =true;
					break;
				}
			}
			if(flag)
				break;
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("hotel-checkin-hp-hotel")).click();
		WebElement check_in_month = driver.findElement(By.xpath("(//div[@id='hotel-checkin-wrapper-hp-hotel']//table/tbody)[1]"));
		selectData(check_in_month, "29");
		Thread.sleep(4000);
		driver.findElement(By.id("hotel-checkout-hp-hotel")).click();
		WebElement check_out_month = driver.findElement(By.xpath("(//div[@id='hotel-checkout-wrapper-hp-hotel']//tbody)[2]"));
		selectData(check_out_month, "4");
		Thread.sleep(4000);
		driver.close();
	}

	

}
