package Assignments;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QtalkBrowserWindow {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   driver.get("https://demoapps.qspiders.com/");
	   Thread.sleep(2000);
	   String parent_handle = driver.getWindowHandle();
	   System.out.println(parent_handle);
       driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
       Thread.sleep(2000);
	   driver.findElement(By.xpath("//ul[@class='pt-2 pe-1']/li[3]/section")).click();    
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
       Thread.sleep(2000);
       
       
       driver.findElement(By.id("browserLink1")).click(); 
       Thread.sleep(2000);
	   Set<String> child = driver.getWindowHandles();
		 System.out.println(child);
		 child.remove(parent_handle);
		 for (String str : child) {
			 driver.switchTo().window(str);
		 }
		 Thread.sleep(2000);
		 
       driver.findElement(By.id("email")).sendKeys("patilprajwal8804@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.id("password")).sendKeys("123456789");
       Thread.sleep(2000);
       driver.findElement(By.id("confirm-password")).sendKeys("123456789");
       Thread.sleep(2000);	
       driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
       Thread.sleep(2000);
       driver.close();
       
       
	}
	
}
