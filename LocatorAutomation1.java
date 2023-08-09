package AmeenAuto.AutomationBasicAmeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorAutomation1 extends BaseDriver{
	
     @Test
	public void FirstLocatorTest () throws InterruptedException{
	
    	 driver.manage().window().maximize();
	
    	 driver.get("https://www.shohoz.com/booking/bus-reservation");
	
	//Thread.sleep(50);
	
	/*
	 * WebElement Bname = driver.findElement(By.name("dest_from")); 
	 * Bname.click();
	 * Thread.sleep(500);
	 */
	
	//custom xpath-> TagName[@Attribute = 'value']
	
	/*
	 * WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	 * email.sendKeys("chyameen@gmail.com"); Thread.sleep(5000);
	 */
	
/*	//custom xpath -> //tagname[contains(text(), 'TextName')]
	WebElement Train = driver.findElement(By.xpath("//ul[@class='list-inline']/div[4]/div[2]/div/label"));
	Train.click();
	Thread.sleep(5000);	
*/
	
/*
 * //ul[@class='list-inline']/div[4]/div[2]/div/label WebElement Train =
 * driver.findElement(By.xpath(
 * "//ul[@class='list-inline']/div[4]/div[2]/div/label")); Train.click();
 * Thread.sleep(5000);
 */
	
/*
 * WebElement Train = driver.findElement(By.xpath(
 * "//body/div[@id='main_wrapper']/section[@id='content']/div[6]/div[1]"));
 * Train.sendKeys("Green line"); Thread.sleep(5000);
 */
	//By id

	  WebElement idseat = driver.findElement(By.name("contactPersonEmail"));
	 idseat.sendKeys("chyameen@gmail.com"); 
	 Thread.sleep(5000);

	
     }
	
}