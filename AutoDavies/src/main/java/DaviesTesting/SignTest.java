package DaviesTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignTest {
	WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.print("Browser Launch");
		//Click on Sign Button 
		driver.findElement(By.xpath("//a[@class='login'][contains(.,'Sign in')]")).click();
		}
	@Test
	public void SignIn() {
		//Enter Valid email 
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("autodaviestesting@gmail.com");
		//password
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("201910");
		// click on sign in 
		driver.findElement(By.xpath("//button[@id='SubmitLogin']//span")).click();
		
		//Confirm to confirm that user have login in successful I verify that the Your is Display 
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				boolean yourlogo= driver.findElement(By.xpath("//img[@class='logo img-responsive']")).isDisplayed();
				Assert.assertTrue(yourlogo);
				System.out.println("logo displayed");
				
			//Test to verify that an Item add to the Cart 
				
	// Click on T-Shirt
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
				
				//Add to Cart and validate 
				driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
				//Test to confirm that the same item I add to Cart
				boolean fadedShirt=driver.findElement(By.xpath("//div[@class='product-image-container layer_cart_img']//img[@title='Faded Short Sleeve T-shirts']")).isDisplayed();
		        Assert.assertTrue(fadedShirt);
		       System.out.println(fadedShirt+"purchase Item choosen" );
		        //CLICK on 
		  driver.findElement(By.xpath("//a[@title='Proceed to checkout']//span")).click();
		}
		
	
	
	@AfterTest
	public void LogOut() {
		//click on signout 
		  driver.findElement(By.xpath("//a[@class='logout'][contains(.,'Sign out')]")).click();
		  
		  //cLOSE browser
		  driver.quit();
		  
		
		
		
		
	}
	
	
	
	
	
	
	
	
	


}
