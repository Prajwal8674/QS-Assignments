package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupByDoubleClick {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),double-click)]"));
	
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		act.moveToElement(doubleClick).perform();
		Thread.sleep(2000);

		act.doubleClick(doubleClick).perform();
		
	}

}
