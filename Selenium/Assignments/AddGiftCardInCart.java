package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddGiftCardInCart {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedTitle="Demo Web Shop";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actualTitle = driver.getTitle();
		
		
		if(expectedTitle.equals(actualTitle)) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Rishabh");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("rishabh@gmail.com");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Prajwal");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("prajwal@gmail.com");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("hello");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).clear();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).sendKeys("2");
			Thread.sleep(1000);

			
			driver.findElement(By.id("add-to-cart-button-2")).click();
			Thread.sleep(5000);

			driver.findElement(By.className("ico-cart")).click();
			Thread.sleep(2000);
			boolean checkIcon = driver.findElement(By.partialLinkText("$25 Virtual Gift Card")).isDisplayed();

			
			 if(checkIcon){
					driver.findElement(By.name("removefromcart")).click();
					
					if(driver.findElement(By.name("removefromcart")).isSelected()) {
						driver.findElement(By.name("updatecart")).click();
					}
			 }
		}else {
			System.out.println("we are not in the dws Page");
		}
	}
}
