package Popup;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class RobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
				
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.get("https://demowebshop.tricentis.com/");
				
				Robot r1 = new Robot();
				
				for(int i = 0 ; i < 3 ; i++) {
					r1.keyPress(KeyEvent.VK_TAB);
					Thread.sleep(2000);
				}
									
				driver.findElement(By.id("small-searchterms")).click();
				r1.keyPress(KeyEvent.VK_D);
				
	 }
	}
