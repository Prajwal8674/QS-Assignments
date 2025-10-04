package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookNewAcc {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.findElement(By.name("firstname")).sendKeys("Prajwal");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		Thread.sleep(1000);

		driver.findElement(By.name("birthday_day")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("select [value='6']")).click();
		Thread.sleep(1000);

		//driver.findElement(By.name("birthday_month")).click();
		driver.findElement(By.id("month")).sendKeys("Aug");
		driver.findElement(By.cssSelector("select [value='2003']")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.name("reg_email__")).sendKeys("patilprajwal@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("password_step_input")).sendKeys("12345678");
		
		
		//driver.close();
	}

}
