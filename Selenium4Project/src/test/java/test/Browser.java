package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Browser {
	
	public static void main(String[] args) throws IOException {
		
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriverService service = new ChromeDriverService.Builder()
                .withLogOutput(System.out)
                .build();
		
		WebDriver driver = new ChromeDriver(service);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); 
		
		driver.get("https://google.com");
		//String originalWindow = driver.getWindowHandle();
		//driver.navigate().to("https://selenium.dev");
		/*
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
			
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(originalWindow);
		
		
		//Frames
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Alert")).click();
		driver.switchTo().defaultContent();

		
		
		//Window management - Position
		driver.manage().window().getPosition().getX();
	    driver.manage().window().getPosition().getY();
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.manage().window().setPosition(new Point(500, 100));
		
		//Window management - Size
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		driver.manage().window().setSize(new Dimension(800, 600));
		
		//Window management
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
	

		//Take screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./image.png"));
		
		//Take element screenshot
		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		File scrFile1 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("./image1.png"));
   		
		//JavaScript
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement button =driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click();", button);
		
		js.executeScript("console.log('hello world')");
		*/
		
		driver.close();
		driver.quit();
	}

}
