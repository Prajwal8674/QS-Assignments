package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetPageHandle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(500);
		
		Set<String> childFacebook = driver.getWindowHandles();
		System.out.println(childFacebook);
		
		
		childFacebook.remove(parentHandle);
		for(String str : childFacebook) {
			driver.switchTo().window(str);
		}
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	}
}
