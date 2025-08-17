package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(1000);
		WebElement selectFile = driver.findElement(By.xpath("//input[@type='file']"));
		selectFile.sendKeys("C:\\Users\\Asus\\Downloads//Prajwal Resume (2).pdf");
	}
}
