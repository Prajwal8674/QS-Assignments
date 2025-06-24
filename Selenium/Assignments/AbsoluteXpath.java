package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		 
		String expectedUrl = "https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl)){
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div/input")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Prajwal");
			Thread.sleep(1000);

			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Patil");
			Thread.sleep(1000);

			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("Prajwal@gmail.com");
			Thread.sleep(1000);

			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("Prajwal123");
			Thread.sleep(1000);

			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("Prajwal123");
			Thread.sleep(1000);

			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
			Thread.sleep(1000);

			
			driver.close();


		}else {
			System.out.println("WE ARE NOT ON DWS PAGE");
		}
		
		
	}
}
