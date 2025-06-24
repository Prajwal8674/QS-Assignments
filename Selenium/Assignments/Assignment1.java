package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

			public static void main(String[] args) throws InterruptedException {

				String expectedUrl = "https://demowebshop.tricentis.com/";
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(1000);

				String actualUrl = driver.getCurrentUrl();
				if(expectedUrl.equals(actualUrl)){
					
					driver.findElement(By.className("ico-login")).click();
					driver.findElement(By.name("Email")).sendKeys("prajwal@gmail.com");
					driver.findElement(By.name("Password")).sendKeys("Prajwal1");

					driver.findElement(By.cssSelector("input[value='Log in']")).click();


					driver.close();
				}else {
					System.out.println("We are not in webpage");
				}
				
			}

		}
