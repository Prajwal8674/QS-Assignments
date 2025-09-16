package Assignments;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllEcommerceSites {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedTitle = "Demo Web Shop";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)){
			
			String expectedUrlRss="https://demowebshop.tricentis.com/news/rss/1";
			
			List<WebElement> sites = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			for(WebElement web : sites) {
				
				web.click();
				String actualUrl = driver.getCurrentUrl();
				
				if(expectedUrlRss.equals(actualUrl)) {	
					Thread.sleep(2000);
					driver.navigate().back();
				}
		   }
		
			Set<String> childs = driver.getWindowHandles();
			
			childs.remove("https://demowebshop.tricentis.com/");
			for(String str : childs) {
				driver.switchTo().window(str);
				
				System.out.println(str);
				String actualUrl = driver.getCurrentUrl();
				Thread.sleep(1000);
				
				if(actualUrl.equals("https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html")) {
					
					driver.switchTo().window(str);
					Thread.sleep(1000);
					driver.findElement(By.id("mce-EMAIL")).sendKeys("patilprajwal8804@gmail.com");
				}
				
				if(actualUrl.equals("https://www.facebook.com/nopCommerce")) {
				
					driver.switchTo().window(str);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[text()='Create new account']")).click();
					Thread.sleep(2000);
				}
				
				if(actualUrl.equals("https://x.com/nopCommerce?mx=2")) {
				
					driver.switchTo().window(str);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[text()='Create account']")).click();
				}
				
				if(actualUrl.equals("https://www.youtube.com/user/nopCommerce")) {
					
					driver.switchTo().window(str);
					Thread.sleep(1000);
					driver.findElement(By.cssSelector(".ytSearchboxComponentInput.yt-searchbox-input.title")).sendKeys("Hello World");
				}
			}
		}
	}
}
