package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/fatemakhaleda/eclipse-workspace/SeleniumProject/Driver/chromedriver");
		driver = new ChromeDriver();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void getMethod() throws InterruptedException {
		driver.get("https://www.fideliscare.org");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void maximizeMethod() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void clickMethod() throws InterruptedException {
		// Tag with a single attribute in dynamic xpath locator to find a (login) element.
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void isDisplayed() throws InterruptedException {
		// Tag with a single attribute in dynamic xpath locator to find a (logo) element.
		driver.findElement(By.xpath("//span[@id='logo']")).isDisplayed();
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public void isSelected() throws InterruptedException {
		// By using xpath locator to find a (Search) element.
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).isSelected();
		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void isEnabled() throws InterruptedException {
		// By using LinkText locator to find a (providers) element.
		driver.findElement(By.linkText("Providers")).isEnabled();
		Thread.sleep(2000);
	}
	@Test(priority = 7)
	public void navigate() throws InterruptedException {
		// Calling navigate() and to() method here to moving one url to another.
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		// Calling navigate() and refresh() method here to refresh new url.
		driver.navigate().refresh();
		Thread.sleep(2000);
		// Calling navigate() and back() method here to going back to previous page.
		driver.navigate().back();
		Thread.sleep(2000);
		// Calling navigate() and forward() method here to going toward.
		driver.navigate().forward();
		Thread.sleep(2000);
	}
	@Test(priority = 8)
	public void sendKeys() throws InterruptedException {
		// Finding a element (searchfield) by using dynamic xpath tag with multiple attribute with 'and' logic.
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' and @id='email']")).sendKeys("rayhanrahmanqa@gmail.com");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
