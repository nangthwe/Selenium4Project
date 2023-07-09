package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {
	// declare global driver variable
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); 
	}
	
	@Test
	public void googleSearch() {
		
	driver.get("https://google.com");
		
	}
	
	@AfterTest
	public void tearDownTest() {
		// close browser
		driver.close();
		driver.quit();
	}

}
