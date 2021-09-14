package hw10Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click_method {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/fatemakhaleda/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.bcbs.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
	}
	
	@Test
	public void clickSearchButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='search-form__submit button js-form-submit form-submit']\n"));
		Thread.sleep(4000);	
	}
	
	@AfterTest
	public void tearup() {
		driver.quit();
	}
	

}
