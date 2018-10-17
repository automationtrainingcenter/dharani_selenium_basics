package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/surya/Documents/selenium/softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		/*
		 * frames are used to display the web page with in a web page To work with
		 * frames we have to switch focus from web driver to that particular frame we
		 * can switch to frames using frame index or frame id or name or frame element
		 */

		// locate all the frames inside the page

		
		// switch to frame 1

		
		// switch to frame2
		/*
		 * now focus is in frame 1, so first switch to default content then switch to
		 * frame 2
		 */

		
		
		// switch to frame 4
		/*
		 * now focus is in frame 2 and frame 4 is in frame 3 so, first switch to default
		 * content then switch to frame 3, locate frame 4 then switch to frame 4
		 */

		
		
		// switch to frame3
		/*
		 * now focus is in frame 4 frame 4 is child of frame 3 so switch focus to frame
		 * 3 by using parentframe
		 */

		
		// switch to main page and click open windows
	
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
