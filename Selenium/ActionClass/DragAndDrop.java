package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		for( int i = 1, j= 1 ; i <=7 ; i++, j++) {
			
			String  ii=Integer.toString(i);
			String  jj=Integer.toString(j);
			
			WebElement source = driver.findElement(By.id("box"+ii));
			WebElement target = driver.findElement(By.id("box10"+jj));
			Thread.sleep(2000);
			act.dragAndDrop(source, target).perform();
		}
	
	}

}
