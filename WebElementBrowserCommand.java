package AmeenAuto.AutomationBasicAmeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementBrowserCommand extends BaseDriver{
	
	String url = "https://www.daraz.com.bd/?spm=a2a0e.home.header.dhome.189012f7XYQfqM";
	
	@Test
	public void BrowserCommandStart() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(300);
		
		//WebElement title = driver.findElement(By.xpath(""));
		
		String Btitle= driver.getTitle();
		System.out.println("Before click Title: " + Btitle);
		Thread.sleep(100);
		
		WebElement tracking = driver.findElement(By.xpath("//div[@id='anonLogin']"));
		tracking.click();
		Thread.sleep(100);
		
		String Atitle= driver.getTitle();
		System.out.println("After Click Title: " + Atitle);	
		Thread.sleep(300);
		
	}

}
