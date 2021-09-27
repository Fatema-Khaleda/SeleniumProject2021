package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumMethods {
WebDriver driver;
	
    @BeforeTest
    public void setup() { 
    	System.setProperty("webdriver.chrome.driver","/Users/fatemakhaleda/eclipse-workspace/SeleniumProject/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();  // maximize()
		driver.manage().window().fullscreen();  //fullscreen()
		driver.get("https://www.bcbs.com/");  // get()
    }
    
    @Test(priority = 1) //isDisplayed()
	public void logoTest() throws InterruptedException {
		boolean elementDisplayed = driver.findElement(By.xpath("(//i[@class='icon'])[2]")).isDisplayed();
		System.out.println(elementDisplayed);
		Thread.sleep(1000);
    }
    
    @Test(priority = 2) // click()
	public void clickontheSearchField() throws InterruptedException { 
    	driver.findElement(By.xpath(" (//input[@class='form-search'])[2] ")).click();
    	Thread.sleep(2000);
    }
    
    @Test(priority = 3)// sendKeys(), clear()
	public void search() throws InterruptedException {   
    	driver.findElement(By.xpath("//input[@id='edit-keys']")).sendKeys("Find a Doctor");
    	driver.findElement(By.xpath("(//i[@class='icon'])[2]")).click();
    	driver.findElement(By.xpath("//input[@id='edit-keys']")).clear();
    	Thread.sleep(2000);
    }
    
    @Test( priority = 4) // keys.ENTER
	public void searchItemByclickingEnterButtonTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='edit-keys']")).sendKeys("Member Services", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='edit-keys']")).clear();
		Thread.sleep(2000);
	}

   
   @Test(priority = 5) // text() & //action class method
   public void actionPipeline() throws InterruptedException {
		Actions actions=new Actions(driver);
		WebElement pipeline =driver.findElement(By.xpath("(//a[contains(text(),'Member Services')])[1]"));
		Thread.sleep(4000);
		actions.moveToElement(pipeline).build().perform(); 
		Thread.sleep(4000);
   }
   
    @Test(priority = 6) // contains(text()) & perform()
	public void accessMyBenifit() throws InterruptedException {
     	Actions actions2 = new Actions(driver);
     	WebElement accWebElement= driver.findElement(By.xpath("(//a[contains(text(),'Access My Benefits')])[1]"));
     	actions2.moveToElement(accWebElement).click().perform();
     	Thread.sleep(3000);
     } 
    
    @Test(priority = 7)// navigate()
	public void navigate() throws InterruptedException {
		driver.navigate().to("https://www.uhc.com/");
		driver.manage().deleteAllCookies();  //deleteAllCookies()
		Thread.sleep(2000);
		driver.navigate().refresh(); //refresh()
		Thread.sleep(2000);
		driver.navigate().back(); //back()
		Thread.sleep(2000);
		driver.navigate().forward(); //forward()
		Thread.sleep(2000);
	}
    
    @Test(priority = 8) // 
   	public void get() throws InterruptedException {
    	Dimension dimension=new Dimension(700,700);
    	driver.manage().window().setSize(dimension);
    	driver.get("https://www.uhc.com/");
   		Thread.sleep(2000);
   		driver.manage().window().getSize();
   		System.out.println("Dimension of the window= "+driver.manage().window().getSize());  //getSize()
 		Thread.sleep(4000);
    }
   
    @Test(priority = 9) //isSelected()
	public void isSelected() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@data-flyout-button='0'])[1]")).isSelected();
		Thread.sleep(2000);
	}
    @Test(priority = 10)
 	public void isenableLogoCheck() throws InterruptedException {
 		boolean uhc=driver.findElement(By.xpath("(//img[@class='lg-show'])[1]")).isEnabled();//isEnable()
 				System.out.println("UnitedHealthcare="+ uhc);
 				Thread.sleep(2000);	
 	}
    
    @Test (priority = 11)  //getText()
 	public void getTextInvestors() {
 		WebElement forProviders=driver.findElement(By.xpath("(//a[text()='For Providers'])[1]"));
 		forProviders.getText();                                 
 		System.out.println("\nThe text of this web element is: "+ forProviders.getText());
    }
    
    @AfterTest  //close()
    public void tearup() {
    	driver.close();
    }
}
