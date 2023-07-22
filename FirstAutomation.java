package AmeenAuto.AutomationBasicAmeen;

import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver {
	
	@Test
	public void FirstTest() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		driver.get("https://testng.org/doc/");
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

	}
}
