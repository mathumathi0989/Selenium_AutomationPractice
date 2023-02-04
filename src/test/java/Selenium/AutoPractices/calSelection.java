package Selenium.AutoPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calSelection {

	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("form_fields[travel_comp_date]")).click();

		WebElement cal = driver.findElement(By.xpath("//div[@class='flatpickr-calendar animate open arrowBottom']"));
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
