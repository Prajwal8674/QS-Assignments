package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {

		String expectedUrl = "https://demowebshop.tricentis.com/";
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demowebshop.tricentis.com/");
		String actualUrl= driver.getCurrentUrl();
		 if(expectedUrl.equals(actualUrl)) {
			 
			 driver.findElement(By.className("ico-register")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.className("ico-login")).click();
			 Thread.sleep(1000);

			 driver.findElement(By.className("ico-cart")).click();
			 Thread.sleep(1000);

			 driver.findElement(By.className("ico-wishlist")).click();
			 Thread.sleep(1000);

			 driver.close();
		 }else {
			 System.out.println("we are not in the dws page");
		 }
		
	}

}
