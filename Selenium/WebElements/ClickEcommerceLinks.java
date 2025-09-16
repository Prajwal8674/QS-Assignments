package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickEcommerceLinks {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedTitle = "Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedUrl="https://demowebshop.tricentis.com/news/rss/1";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			
			List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));

			for(WebElement web : links) {
			
				web.click();
				String actcualUrl = driver.getCurrentUrl();
				if(expectedUrl.equals(actcualUrl)) {	
					Thread.sleep(2000);
					driver.navigate().back();
				}
		   }
		}else {
			System.out.println("We are not in the dws page");
		}
	}
}
