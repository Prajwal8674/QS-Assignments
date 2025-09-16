package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	public static void main(String[] args) throws InterruptedException {

		String expectedUrl = "https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);

		String actualUrl = driver.getCurrentUrl();
		if(expectedUrl.equals(actualUrl)){
			
			driver.findElement(By.cssSelector("a[class='ico-register']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("input[value='M']")).click();
			Thread.sleep(1000);

			driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Prajwal");
			Thread.sleep(1000);

			driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Patil");
			Thread.sleep(1000);

			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("prajwal@gmail.com");
			Thread.sleep(1000);

			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("prajwal1");
			Thread.sleep(1000);

			driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("prajwal1");
			Thread.sleep(1000);


			driver.findElement(By.cssSelector("[value='Register']")).click();
			driver.close();
		}else {
			System.out.println("We are not in webpage");
		}
		
	}

}
