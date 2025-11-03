package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksForPages {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> navbar = driver.findElements(By.xpath("//ul[@ class='top-menu']/li/a"));
		
		for(WebElement web : navbar) {
			
			web.click();
			driver.navigate().back();
		
		}
	}

}
