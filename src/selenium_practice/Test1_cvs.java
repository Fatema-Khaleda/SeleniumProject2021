package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_cvs {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/fatemakhaleda/eclipse-workspace/SeleniumProject/Driver/chromedriver");
		driver.manage().window().maximize();
		driver.get("https://www.cvs.com/");
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 1)
	public void clickSearchButton1() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='search-form__submit button js-form-submit form-submit']\n"));
		Thread.sleep(4000);	
	}


	@Test(enabled = true, priority = 2)
	public void search() throws InterruptedException {
		WebElement searchfield = driver.findElement(By.id("cvs-search-input"));
		searchfield.sendKeys("Shampoo");

		Thread.sleep(3000);

	}

	@Test(enabled = false , priority = 1)
	public void clickSearchButton2() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='search-form__submit button js-form-submit form-submit']\n")).click();
		Thread.sleep(4000);
	}

	@AfterTest
	public void close() {
		driver.quit();
	}


}
