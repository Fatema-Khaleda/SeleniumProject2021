package hw10Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isDisplayed_method {
WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/fatemakhaleda/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.bcbs.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	}
	
	
	@Test(enabled = false , priority = 1)
	public void clickSearchButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='search-form__submit button js-form-submit form-submit']\n")).click();
		Thread.sleep(2000);
	}
	
	// Use of cssSelector
	@Test(enabled = true , priority = 2)
	public void isDisplayedMethod() throws InterruptedException {
		driver.findElement(By.cssSelector(".path-bcbscom-homepage path__bcbscom-homepage page-node-45 path-frontpage page-node-type-page language-en")).isDisplayed();
		//passcode feild of user sin on.
		Thread.sleep(2000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	} 

}
