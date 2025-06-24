package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static ChromeDriver driver = null;
	
	public static void preCondition() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void register() throws InterruptedException {
		
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[value='M']")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Prajwal");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Patil");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("prajwal01@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("prajwal01");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("prajwal01");
		Thread.sleep(1000);


		driver.findElement(By.cssSelector("[value='Register']")).click();
	}
	
	
	public static void login() throws InterruptedException {
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("Email")).sendKeys("prajwal01@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys("prajwal01");
		Thread.sleep(1000);

		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(1000);

	}
	public static void logout() {
		
		driver.findElement(By.id("ico-logout"));
	}
	public static void postCond() {
		driver.close();
	}
}
