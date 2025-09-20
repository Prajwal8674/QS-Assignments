package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1:5500/index.html");
		Thread.sleep(2000);
		
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
		Select s1 = new Select(singleSelect);
		
		s1.selectByIndex(1);
		Thread.sleep(1000);
		s1.deselectByIndex(1);
	}
}
