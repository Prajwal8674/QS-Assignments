package ActionsClassKeyBoard;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysTwoArgs {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver);

		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		WebElement search = driver.findElement(By.cssSelector(".button-1.search-box-button"));

		Thread.sleep(1000);
		act.sendKeys(searchField, "sunglasses").perform();
		Thread.sleep(500);
		act.keyDown(search,Keys.ENTER).perform();

	}

}
