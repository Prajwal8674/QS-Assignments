package UtilityClass;

import org.openqa.selenium.By;

public class MainClass extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		preCondition();
		Thread.sleep(2000);
		//register();
		login();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		logout();
		Thread.sleep(1000);
		postCond();
		
	}
}
