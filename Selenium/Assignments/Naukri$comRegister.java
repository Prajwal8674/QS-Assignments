package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri$comRegister {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount");
	}

}
