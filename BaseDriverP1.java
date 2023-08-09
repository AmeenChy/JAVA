package AmeenAuto.AutomationBasicAmeen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriverP1 {
	
	WebDriver driver = null;
	@BeforeSuite
	public void start() {
		
		String browser = System.getProperty("browser", "Chrome");
		
		if(browser.contains("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
if(browser.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
if(browser.contains("Edges")) {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
}
	}
	
    @AfterSuite
	public void close() {
		
		driver.close();
	}

	}
	


