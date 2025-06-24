package Assignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AgodaCalenderPopup {

	public static void main(String[] args) throws InterruptedException {

       
	    ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable notificarions");
		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");
		Thread.sleep(500);

		driver.findElement(By.cssSelector(".ficon.IconBox__icon.ficon-20.ficon-check-in")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--weekends.DayPicker-Day--today")).click();		
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector(".ficon.IconBox__icon.ficon-20.ficon-check-in")).click();
		Thread.sleep(500);

		String checkIn = ".DayPicker-Day.DayPicker-Day--weekends.DayPicker-Day--today";
		driver.findElement(By.cssSelector(checkIn)).click();
		
		Thread.sleep(500);
		
		String checkInDate = driver.findElement(By.xpath("//div[@data-selenium='checkInText']")).getText();
		System.out.println(checkInDate);
		
		
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");
		
		int dayForCheckOut = 120;
        LocalDate futureDate = today.plusDays(dayForCheckOut);
        
        String todayDate = today.format(formatter);
        String dateAfter120Days = futureDate.format(formatter);

        System.out.println(todayDate);
        System.out.println(dateAfter120Days);

		while(true) {

			try {
				driver.findElement(By.xpath("//div[@aria-label='"+dateAfter120Days+" ']")).click();
				break;	
				
			}catch (Exception e){
			
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
				Thread.sleep(500);
			}
			
		}
	}
}
