package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			WebElement register  = driver.findElement(By.className("ico-register"));
			
			if(register.isEnabled()) {
				System.out.println("web element is enabled");
				register.click();
				
			}else{
				System.out.println("elemment is not enabled");

			}
	}
}
