package AmeenAuto.AutomationBasicAmeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorAutomationDaraz extends BaseDriver {
	
	
	@Test
	public void Locatorstart() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7LjbGb3&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");
		Thread.sleep(500);
		
		/*
		 * WebElement clsele=
		 * driver.findElement(By.xpath("//span[contains(text(),'CUSTOMER CARE')]"));
		 * clsele.click(); Thread.sleep(500);
		 */
		
		/*
		 * WebElement clsele= driver.findElement(By.xpath("//input[@type='text']"));
		 * clsele.sendKeys("Ameen"); Thread.sleep(500);
		 */
		
		/*
		 * WebElement clsele= driver.findElement(By.className("next-btn"));
		 * clsele.click(); Thread.sleep(500);
		 */
		
		/*
		 * WebElement clsele= driver.findElement(By.id("q"));
		 * clsele.sendKeys("MotorByke"); Thread.sleep(500);
		 */
		
		WebElement clsele= driver.findElement(By.linkText("CUSTOMER CARE"));
		clsele.click();
		Thread.sleep(500);
		

	}

}
