package advanced;
//locate table body

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//locate number of rows in the table using tr tag

//iterate over each row and find the columns using td tag

//iterate over each column or cell and get the table cell

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		String data = "Taipei 101";
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// locate the table
		WebElement table_body = driver.findElement(By.cssSelector("#content>table>tbody"));
		// locate the rows inside the table
		List<WebElement> rows = table_body.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			WebElement building_name = row.findElement(By.tagName("th"));
			if (building_name.getText().equals(data)) {
				System.out.println(data);
				List<WebElement> cells = row.findElements(By.tagName("td"));
				cells.get(cells.size() - 1).findElement(By.partialLinkText("details")).click();
				break;
			}

		}
		Thread.sleep(5000);

		driver.close();
	}

}
