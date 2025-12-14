package ActionsClassKeyBoard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
			act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.PAGE_UP).perform();
			act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.PAGE_UP).perform();
		
		
	}

}
