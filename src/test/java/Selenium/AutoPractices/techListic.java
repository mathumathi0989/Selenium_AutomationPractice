package Selenium.AutoPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class techListic {

	public WebDriver driver;
	@BeforeTest
	public void launch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	

public void inspection() {
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.cssSelector("#user-name"));
	driver.findElement(By.cssSelector("#password"));
	driver.findElement(By.cssSelector("#login-button"));
	driver.findElement(By.className("bot_column"));
	driver.findElement(By.className("login_logo"));
	
}
	
//	@Test
	public void SelectEx() throws Exception {
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement select = driver.findElement(By.id("dropdown"));
		Select s = new Select(select);
		 s.selectByVisibleText("Option 1");
		WebElement se_Option1 =  select.findElement(By.xpath("//option[@value='1']"));
		WebElement se_Option2 = select.findElement(By.xpath("//option[@value='2']"));
		Assert.assertTrue(se_Option1.isDisplayed());
		Assert.assertTrue(se_Option2.isDisplayed());
		
	}
	
	//@Test
	public void hoverEx() {
		driver.get("https://the-internet.herokuapp.com/hovers");
		WebElement action = driver.findElement(By.xpath("//div[@class='figure']"));
		Actions a = new Actions(driver);
		a.moveToElement(action).build().perform();
		String actual = driver.findElement(By.xpath("//div[@class='figcaption']/h5")).getText();
		Assert.assertEquals(actual, "name: user1");
		
		
	}
	
	//@Test
	public void context_menu() {
		driver.get("https://the-internet.herokuapp.com/context_menu");
		WebElement action = driver.findElement(By.id("hot-spot"));
		Actions a = new Actions(driver);
		a.contextClick(action).build().perform();
		driver.switchTo().alert().accept();
			}
	
	
//	@Test
	public void keyPresses() {
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.findElement(By.id("target")).sendKeys(Keys.ARROW_RIGHT);
		String actual = driver.findElement(By.xpath("//p[@id='result']")).getText();
		Assert.assertEquals(actual, "You entered: RIGHT");
	}
	
	//@Test
	public void htmlele() {
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation");
		WebElement cl = driver.findElement(By.linkText("Clickable Icon"));
		String actual = cl.getAttribute("href");
		Assert.assertEquals(actual, "https://ultimateqa.com/link-success/");
		String actualVal = cl.getCssValue("background-origin");
		Assert.assertEquals(actualVal, "padding-box");
		}
	
	
	@AfterTest
	public void tear() {
		driver.close();
	}
	
	
}
