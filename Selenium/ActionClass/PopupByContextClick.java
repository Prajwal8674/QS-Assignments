package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupByContextClick {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =   new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
	
		Thread.sleep(2000);
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.moveToElement(rightClick).perform();
		Thread.sleep(2000);

		act.contextClick(rightClick).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		Thread.sleep(2000);
		
		try {
			rightClick.click();
			System.out.println("not displayed");

		} catch (Exception e) {
			System.out.println("displayed");
		}
	
	}

}
