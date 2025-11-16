package SelectClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/apparel-shoes']")).click();
		WebElement singleSelect = driver.findElement(By.id("products-orderby"));
		Select s1 = new Select(singleSelect);
		s1.selectByVisibleText("Name: A to Z");
		Thread.sleep(2000);
//		s1.selectByValue("lr");
//		s1.selectByIndex(10);
	}

}
