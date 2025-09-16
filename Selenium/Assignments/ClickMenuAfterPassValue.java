package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMenuAfterPassValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Selenium%20Webdriver/index.html");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("small-searchterms")).sendKeys("hello");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).perform();
		

		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
