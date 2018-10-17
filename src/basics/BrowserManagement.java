package basics;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManagement {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//getPosition()
		Point position = driver.manage().window().getPosition();
//		System.out.println(position.getX());
//		System.out.println(position.getY());
		System.out.println(position);
		
		//getSize()
		System.out.println("before maximize");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		System.out.println(size);
		
		//maximize()
//		Options manage = driver.manage();
//		Window window = manage.window();
//		window.maximize();
		
		driver.manage().window().maximize();
		
		System.out.println("before maximize");
		size = driver.manage().window().getSize();
		System.out.println(size);
		
		//fullscreen()
		driver.manage().window().fullscreen();
		
		
		driver.close();
	}
	

}
