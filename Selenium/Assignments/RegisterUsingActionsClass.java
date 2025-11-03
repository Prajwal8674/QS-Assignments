package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterUsingActionsClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		
		WebElement register = driver.findElement(By.className("ico-register"));
		act.moveToElement(register).click(register).perform();
		Thread.sleep(500);

		WebElement gender = driver.findElement(By.id("gender-male"));
		act.keyDown(gender, Keys.ENTER).keyUp(gender,Keys.ENTER).perform();
		Thread.sleep(500);
		
		WebElement fName = driver.findElement(By.id("FirstName"));
		act.keyDown(fName,Keys.ENTER).sendKeys("Prajwal").perform();	
		Thread.sleep(100);

		WebElement lName = driver.findElement(By.id("LastName"));
		act.keyDown(lName,Keys.ENTER).sendKeys("Patil").perform();
		Thread.sleep(100);

		WebElement email = driver.findElement(By.id("Email"));
		act.keyDown(email,Keys.ENTER).sendKeys("patilprajwal8804@gmail.com").perform();
		Thread.sleep(100);
		
		WebElement password = driver.findElement(By.id("Password"));
		act.keyDown(password,Keys.ENTER).sendKeys("prajwal").perform();
		Thread.sleep(100);
		
		WebElement  confirmPass = driver.findElement(By.id("ConfirmPassword"));
		act.keyDown(confirmPass,Keys.ENTER).sendKeys("prajwal").perform();
		Thread.sleep(100);

		WebElement  registerBtn = driver.findElement(By.id("register-button"));
		act.keyDown(registerBtn,Keys.ENTER).perform();
		Thread.sleep(100);
		
		
	}

}
