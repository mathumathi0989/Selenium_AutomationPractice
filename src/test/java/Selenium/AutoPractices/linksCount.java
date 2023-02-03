package Selenium.AutoPractices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class linksCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		int NumberOfLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links on the webpage are : " +NumberOfLinks);
		
		System.out.println("Link text are below ");
	
		for (int i=0; i<NumberOfLinks; i++) {
			List<WebElement> li = driver.findElements(By.xpath("//a"));
			System.out.println(li.get(i).getText());
		}
	
		
		int NumOfFooterLinks = driver.findElements(By.xpath("//*[@class=' footer_top_agile_w3ls gffoot footer_style']//a")).size();
		System.out.println("Number of links on footer: " +NumOfFooterLinks);
		
		WebElement FirstColFooter = driver.findElement(By.xpath("//*[@class=' footer_top_agile_w3ls gffoot footer_style']//td[1]"));
		
		int firstColLinks = FirstColFooter.findElements(By.tagName("a")).size();
		System.out.println("Number of links on first column footer : "+firstColLinks);
		
		for (int i=1; i<firstColLinks; i++) {
			List<WebElement> li = driver.findElements(By.xpath("//*[@class=' footer_top_agile_w3ls gffoot footer_style']//td[1]//a"));
			li.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
			Thread.sleep(5000);
			Set<String> win = driver.getWindowHandles();
			Iterator<String> it = win.iterator();
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.switchTo().defaultContent();
			}
			
		
	
		
		
		
		driver.quit();
		
		
		
		
	}

}
