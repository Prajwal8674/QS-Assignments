package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByWebElArg {
	
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		Thread.sleep(1000);
		
		WebElement iframe= driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("1234567890");
	
	}
}
