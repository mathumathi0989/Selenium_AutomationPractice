package Selenium.AutoPractices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rahulAutoPract1 {
public 	WebDriver driver;
public String text = "tom";
public String exp;
	@BeforeClass
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void search() throws Exception {
		driver.findElement(By.className("search-keyword")).sendKeys(text);
		Thread.sleep(1000);
		String actual = driver.findElement(By.className("product-name")).getText();
		System.out.println(actual);
		
		String[] actual1 = actual.split(" ");
		String actualText = actual1[0];
		System.out.println(actualText);
		driver.findElement(By.xpath("//*[@class='cart-header-navlink'][1]")).click();
		Thread.sleep(4000);
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String mainWindow = i.next();
			String childWindow = i.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(text);
		 exp = driver.findElement(By.xpath("//*[contains (@class, 'table') and contains (@class,'table-bordered' )]/thead/following-sibling::tbody/tr/td")).getText();
		System.out.println(exp);
		driver.close();
		driver.switchTo().window(mainWindow);
		
		
		Assert.assertEquals(actualText, exp);
	}
	
	@AfterClass
	public void tear() {
		driver.quit();
	}
	
	
}
