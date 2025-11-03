package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomptAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(500);
	
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert a1 = driver.switchTo().alert();
		
		a1.sendKeys("Prajwddal");
		a1.accept();
	}

}
