	package Assignments;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	
	public class NewForm {
	
		public static void main(String[] args) throws InterruptedException {
	
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			Actions act = new Actions(driver);
			
			WebElement fName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
			act.keyDown(fName,Keys.ENTER).sendKeys("Prajwal").perform();	
			Thread.sleep(100);
			
			WebElement lName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
			act.keyDown(lName,Keys.ENTER).sendKeys("Patil").perform();	
			Thread.sleep(100);
			
			WebElement adress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
			act.keyDown(adress,Keys.ENTER).sendKeys("Nagpur").perform();	
			Thread.sleep(500);
			
			WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
			act.keyDown(email,Keys.ENTER).sendKeys("PatilprajwaL@gmail.com").perform();	
			Thread.sleep(500);
			
			WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
			act.keyDown(phone,Keys.ENTER).sendKeys("7263948915").perform();	
			Thread.sleep(500);
			
			WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
			act.keyDown(male,Keys.ENTER).perform();	
			Thread.sleep(500);
			
			WebElement hobby = driver.findElement(By.id("checkbox2"));
			act.keyDown(hobby,Keys.ENTER).perform();	
			Thread.sleep(500);
			
			WebElement language = driver.findElement(By.id("msdd"));
			act.moveToElement(language).click().perform();
			Thread.sleep(500);	
	
			WebElement languageEnglish = driver.findElement(By.xpath("//li[@class='ng-scope'][8]"));
			act.moveToElement(languageEnglish).click().perform();
			Thread.sleep(500);
			
			WebElement selectSkill = driver.findElement(By.id("Skills"));
			Select s1 = new Select(selectSkill);
			s1.selectByVisibleText("Java");
	        Thread.sleep(500);
	
			WebElement selectCountry = driver.findElement(By.cssSelector(".select2-selection.select2-selection--single"));
	        selectCountry.click();
	        Thread.sleep(300);
	        
	        WebElement countryIndia = driver.findElement(By.xpath("//li[@class='select2-results__option'][5]"));
	        countryIndia.click();
	        Thread.sleep(300);
	        
			WebElement yearBox = driver.findElement(By.id("yearbox"));
		    s1 = new Select(yearBox);
			s1.selectByVisibleText("2003");
			
			WebElement monthBox = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		    s1 = new Select(monthBox);
			s1.selectByVisibleText("August");
			Thread.sleep(500);
			
			WebElement dayBox = driver.findElement(By.id("daybox"));
		    s1 = new Select(dayBox);
			s1.selectByVisibleText("6");
			Thread.sleep(500);
			
		   driver.findElement(By.id("firstpassword")).sendKeys("prajwal121");
			Thread.sleep(300);
			driver.findElement(By.id("secondpassword")).sendKeys("Prajwal121");
			
		
			
			
		}
	
	}
