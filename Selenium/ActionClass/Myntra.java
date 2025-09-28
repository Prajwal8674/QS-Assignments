package ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.myntra.com/");
	        driver.findElement(By.linkText("Men")).click();

	        Thread.sleep(500);
	        WebElement men = driver.findElement(By.xpath("//a[@data-reactid='21']"));
	        Actions act = new Actions(driver);
	        act.moveToElement(men).perform();
	        
	        driver.findElement(By.xpath("//a[@data-reactid=\"41\"]")).click();
	}
	
}
