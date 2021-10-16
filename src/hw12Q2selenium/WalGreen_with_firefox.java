package hw12Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WalGreen_with_firefox {

	WebDriver driver;
	
    @BeforeTest
    public void setup() { 
    	System.setProperty("webdriver.chrome.driver","/Users/fatemakhaleda/eclipse-workspace/SeleniumProject/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();  // maximize()
		driver.manage().window().fullscreen();  //fullscreen()
		driver.get("https://www.walgreens.com/");  // get()
    }
    
//    @Test(priority = 1) //isDisplayed()
//   	public void logoTest() throws InterruptedException {
//   		boolean elementDisplayed = driver.findElement(By.cssSelector(".page__wrap sr-only")).isDisplayed();
//   		System.out.println(elementDisplayed);
//   		Thread.sleep(1000);
//    }
    @Test(priority = 2)
    public void clickOnFreeFluShot() throws InterruptedException {
    	driver.findElement(By.xpath("(//div[@class='card__item card__item-new'])[2]")).click();
    	Thread.sleep(2000);	
    }
    @Test(priority = 3)
    public void scheduleFluShot() throws InterruptedException {
    	driver.findElement(By.xpath("(//span[@class='btn btn__white'])[2]")).click();
    	Thread.sleep(2000);
    }
    
    @AfterTest
    public void tearup() {
    	driver.close();
    }

}
