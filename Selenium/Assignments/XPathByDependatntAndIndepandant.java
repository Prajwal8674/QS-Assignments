package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByDependatntAndIndepandant {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span")).getText());
		System.out.println(driver.findElement(By.xpath("//a[text()='Music 2']/../../../../following-sibling::div/div/div/div[3]/div/span")).getText());

	}

}
