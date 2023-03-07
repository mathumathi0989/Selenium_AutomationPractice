package Selenium.AutoPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class techListicPract {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page is " +title);
		System.out.println("Url of the page is "+driver.getCurrentUrl());
		System.out.println("---------------------------");
		String pageSource = driver.getPageSource();
	System.out.println(pageSource);
		Boolean ps = pageSource.contains(driver.getTitle());
		//Assert.assertEquals(ps, true);
		
		
		driver.quit();
		
		
	}
	
}
