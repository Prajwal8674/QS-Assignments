package SelectClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.get("http://127.0.0.1:5500/index.html");
		Thread.sleep(2000);
		
		WebElement multiSelect = driver.findElement(By.id("multiple_cars"));
		Select s1 = new Select(multiSelect);
		
		s1.selectByIndex(1);
		s1.selectByVisibleText("BMW");
		s1.selectByIndex(3);
		s1.selectByIndex(4);
		s1.selectByIndex(5);

		System.out.println(s1.isMultiple());
		
		List<WebElement> options = s1.getOptions();
		int i = 0 ;
		for(WebElement web : options) {
			
			s1.selectByIndex(i++);
			Thread.sleep(500);
		
		}
		s1.deselectAll();
	}
}
