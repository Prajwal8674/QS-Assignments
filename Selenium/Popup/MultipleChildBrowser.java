package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		String expectedUrl = "https://x.com/nopCommerce";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Actions act = new Actions(driver);
		Thread.sleep(500);
		act.keyDown(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();

		Set<String> childs = driver.getWindowHandles();
		for(String str : childs) {
			driver.switchTo().window(str);
			
			String actualUrl = driver.getCurrentUrl();
			if(expectedUrl.equals(actualUrl)) {
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
			}
		}
		Thread.sleep(500);
	}
}
