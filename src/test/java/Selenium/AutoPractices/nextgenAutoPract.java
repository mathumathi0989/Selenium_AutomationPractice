package Selenium.AutoPractices;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nextgenAutoPract {

	public WebDriver driver;
	
	@BeforeTest
	public void browserLaunch() {
		Scanner s = new Scanner(System.in);
		String browserName = s.nextLine();
		System.out.println(browserName);
		if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		else if (browserName.equals("ie")) {
			WebDriverManager.edgedriver();
			driver = new EdgeDriver();
		}
		
	
	}
	
	@Test
	public void excersise1() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
		String url = driver.getCurrentUrl();
	if(url.contains("google.co.in")) {
		System.out.println("driver navigated to google.co.in");
	}	
	else {System.out.println("driver doesnt contains to google.co.in");}
	}
	
	@Test
	public void excercise2() {
		driver.get("https://www.google.co.in");
		System.out.println("Current url is " +driver.getCurrentUrl());
	}
	
	
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
