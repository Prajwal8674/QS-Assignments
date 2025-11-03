package ActionsClassKeyBoard;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		for(int i = 0 ; i < 6 ; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		act.sendKeys("Oneplus earbud").keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
}
