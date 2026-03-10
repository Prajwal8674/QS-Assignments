package RelativeXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByTextFunction {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement text = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		System.out.print(text.getText());
	}

}
