package AmeenAuto.AutomationBasicAmeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorAutomation extends BaseDriver{
	
     @Test
	public void FirstLocatorTest () throws InterruptedException{
	
	driver.get("https://www.cricbuzz.com/");
	
	Thread.sleep(5000);
	
	WebElement Lnews = driver.findElement(By.className("cb-hm-mnu-itm"));
	Lnews.click();
	Thread.sleep(5000);
	
	WebElement LText = driver.findElement(By.linkText("Teams"));
	LText.click();
	Thread.sleep(5000);
	
	WebElement IDText = driver.findElement(By.id("cricbuzz-plus-main-menu"));
	IDText.click();
	Thread.sleep(5000);
	

}
}