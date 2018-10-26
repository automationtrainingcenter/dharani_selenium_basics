package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		//switch to the frame
		driver.switchTo().frame(0);
		WebElement sliderHead = driver.findElement(By.xpath("//div[@id='slider']/span"));
		WebElement slider = driver.findElement(By.id("slider"));
		int length = slider.getSize().getWidth();
		Actions action = new Actions(driver);
//		action.clickAndHold(sliderHead).moveByOffset(length - 10, 0).build().perform();
		for(int i = 0; i<length-50; i+=50) {
			action.clickAndHold(sliderHead).moveByOffset(50, 0).build().perform();
			Thread.sleep(2000);
		}
		driver.close();
	}

}
