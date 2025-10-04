package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		String product = "aeroplane";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchField=driver.findElement(By.id("small-searchterms"));
		searchField.sendKeys("aeroplane");
		
		Thread.sleep(2000);
	
		String actualData = searchField.getAttribute("value");
		System.out.println(actualData);
		
		if(product.equals(actualData)){
			
			System.out.println("Data is successfully Added");
		}else {
			System.out.println("Data is not Added");

		}
		Thread.sleep(2000);
		driver.quit();		
	}

}
