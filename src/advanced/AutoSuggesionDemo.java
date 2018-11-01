package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesionDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		WebElement suggestions_div = driver.findElement(By.id("suggestions"));
		List<WebElement> suggestions = suggestions_div.findElements(By.tagName("div"));
		for(WebElement suggestion : suggestions) {
			if(suggestion.getText().equals("iphone 8 plus")) {
				suggestion.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();
	}

}
