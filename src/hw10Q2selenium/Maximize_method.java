package hw10Q2selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/fatemakhaleda/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bcbs.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.quit();
		
	}
	
}