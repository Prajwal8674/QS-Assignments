 package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(1000);
		
		WebElement outerFrame = driver.findElement(By.xpath("(//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerFrame);
		Thread.sleep(1000);
		
		WebElement innerFrame = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(innerFrame);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello world");
		
	}

}
