package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement dwsLogo= driver.findElement(By.cssSelector(".header-logo"));
	
		System.out.println("DWS logo : "+dwsLogo.isDisplayed());
		boolean facebook =driver.findElement(By.linkText("Facebook")).isDisplayed();
		System.out.println("Facebook : "+facebook);
		
	}
}
