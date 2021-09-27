package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2_display_method {
    
    WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/fatemakhaleda/eclipse-workspace/SeleniumProject/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(2000);
	}

	// isDisplayed() is an alternate of click()method which is boolean type
	// isDisplayed() is the method used to verify the presence of a web element
	// within the web page.
	// Use of isDisplayed()

	@Test (enabled = true, priority = 1)
	public void logoTest() throws InterruptedException {
		boolean elementDisplayed = driver.findElement(By.xpath("//a[@id='cms-homepage-link']")).isDisplayed();
		System.out.println(elementDisplayed);
		Thread.sleep(2000);
	}
	
	@Test (enabled = true, priority = 2)
	public void newUserRegistrationTest() throws InterruptedException {
		boolean elementEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println(elementEnabled);
		Thread.sleep(5000);
	}
	
	@Test(enabled = true, priority = 3)
	public void findADocotorByPrimaryCareTest() {
		driver.get("https://www.mountsinai.org/");
		boolean elementSelected = driver.findElement(By.xpath("(//span[text()='Primary Care'])[1]")).isSelected();
		System.out.println(elementSelected);
	}


	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}


