package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> cp = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement web : cp){
			
			web.click();
		}
	}

}
