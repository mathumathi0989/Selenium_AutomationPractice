package Selenium.AutoPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class udemyPract_OOPS_Test {

public WebDriver driver;
	

	@BeforeClass
	public void launch() {
		WebDriverManager.chromedriver().setup();	
	}
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void checkout_Signup() throws Exception {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		udemyPract_Oops4Page oops = new udemyPract_Oops4Page(driver);
		oops.login();
		
		driver.navigate().to("https://www.saucedemo.com/checkout-step-one.html");
		Thread.sleep(1000);
		new udemyPract_OopsPage(driver).submitPersonalInfo();
		new udemyPract_Oops2Page(driver).finish();
		
		Assert.assertTrue(new udemyPract_Oops3Page(driver).thankyou()); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
