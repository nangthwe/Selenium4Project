package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); 
		
		driver.get("https://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("ABCD", Keys.ENTER);
		
		/*
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
		
		driver.findElement(By.cssSelector("#fname")).sendKeys("Thandar");
		*/
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("ABCD");
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}
}
