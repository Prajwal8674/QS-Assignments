package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(500);
		driver.findElement(By.id("dvfarecal")).click();
		driver.findElement(By.id("snd_6_11/01/2025")).click();
		driver.findElement(By.id("divRtnCal")).click();
		
		
		
			driver.findElement(By.id("img2Nex")).click();
			Thread.sleep(300);
			driver.findElement(By.id("img2Nex")).click();
			Thread.sleep(300);
			driver.findElement(By.id("img2Nex")).click();
			Thread.sleep(300);
		
		driver.findElement(By.id("snd_2_06/05/2025")).click();

	}

}
