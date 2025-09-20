package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
// 		By WebElement argument
		
//		WebElement frame = driver.findElement(By.id("singleframe"));
//		driver.switchTo().frame(frame);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).clear();
//		Thread.sleep(1000);
		
//		By index Argument
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
		Thread.sleep(2000);
	
//		By String Argument
		
//		
//		driver.switchTo().frame("singleframe");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
//		
		
				
		
	}
}
