package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RedbusCalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.out.println();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable notificarions");
		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(500);
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(500);

		driver.findElement(By.id("dest")).sendKeys("Banglore");
		Thread.sleep(500);
		
		driver.findElement(By.className("dateText")).click();
		Thread.sleep(500);
		
		while(true) {
			
			try {
				driver.findElement(By.cssSelector(".DayTiles__CalendarDaysBlock-sc-1xum02u-0.isgDNj")).click();
				
			}catch (Exception e){
				
				driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
				
				Thread.sleep(500);
			}
			finally {
				driver.quit();
			}
		}
	}
}
