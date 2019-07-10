package DaviesTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class SignupTesting {

	WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		System.out.print("Browser Launch");
		//Click on Sign Button 
		driver.findElement(By.xpath("//a[@class='login'][contains(.,'Sign in')]")).click();
		
		}
	
	@Test
	public void SignIn() throws Exception {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//click on sign up button 
		driver.findElement(By.xpath("//span[contains(.,'Create an account')]")).sendKeys("autodaviestesting@gmail.com");
		//click create account 
		driver.findElement(By.xpath("//input[@type='text'][contains(@id,'create')]")).click();
		//Select Title
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		
		//Enter First Name
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Testing");
		//Enter Last Name
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Davies tESTING");
		//Email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("autodaviestesting@gmail.com");
		//Enter Password
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("201910");
		//Select Date of Birth
		WebElement DOB_dropdown= driver.findElement(By.xpath("date of birth"));
		Select dob= new Select(DOB_dropdown);
		dob.selectByIndex(3);
		Thread.sleep(300);
		//select Month
		Select mob= new Select(DOB_dropdown);
		mob.selectByVisibleText("July" );
		//select 
		Select Yob= new Select(DOB_dropdown);
		mob.selectByVisibleText("2017" );
		
		
		
	
		
		driver.findElement(By.xpath("//span[contains(.,'Create an account')]")).sendKeys("autodaviestesting@gmail.com");
		
		// Enter your address
		driver.findElement(By.xpath("")).sendKeys("autodaviestesting@gmail.com");
		//First Name
		driver.findElement(By.xpath(" //input[@id='firstname']")).sendKeys("tESTING ");
		//Lastname 
		
		driver.findElement(By.xpath(" //input[@id='lastname']")).sendKeys("TESTING");
		//company
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("tESTING");
		
		//Address
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("autodaviestesting@gmail.com");
		//city
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("TESTING");
		
		
		//State
		Select CITY= new Select(DOB_dropdown);
		CITY.selectByValue("21");
		
		
		
		
		//postcode
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("0000");
		
		//country
		
		
		
		
		
		
		
		
		//Phone 
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("00000000000");
		//Assign an address alias for future reference
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("testing");
		
		// click on create account 
		driver.findElement(By.xpath("//button[@id='submitAccount']//span")).click();
		
		
		}
		
	
	
	@AfterTest
	public void LogOut() {
		//click on sign out 
		  driver.findElement(By.xpath("//a[@class='logout'][contains(.,'Sign out')]")).click();
		  
		  //cLOSE browser
		  driver.quit();
	
}
}
