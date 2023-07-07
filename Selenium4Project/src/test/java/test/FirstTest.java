package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
//		Test other version of chrome browser
//		WebDriverManager.chromedriver().driverVersion("113.0.5672.63").setup();
		
		ChromeDriverService service = new ChromeDriverService.Builder()
                .withLogOutput(System.out)
                .build();
		
		WebDriver driver = new ChromeDriver(service);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); 
		
		driver.get("https://google.com");
		
		driver.close();
	}
}
