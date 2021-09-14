package lec29_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_use_of_get_method {
	WebDriver driver;

	// public static void main(String[] args) throws InterruptedException {
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/fatemakhaleda/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(3333);
	}
	@Test
	public void loginButtonTest() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(3333);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}


	

	
}



