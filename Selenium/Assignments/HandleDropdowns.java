package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdowns {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
        
		
		WebElement selects = driver.findElement(By.id("products-orderby"));
		Select s1 = new Select(selects);
		List<WebElement> options = s1.getOptions();
	
		for(int i = 0 ; i < options.size();i++) {
			selects = driver.findElement(By.id("products-orderby"));
			s1=new Select(selects);
			s1.selectByIndex(i);
			Thread.sleep(500);
		}
		
	}

}
