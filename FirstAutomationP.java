package AmeenAuto.AutomationBasicAmeen;

import org.testng.annotations.Test;

public class FirstAutomationP extends BaseDriverP{
	@Test
	public void firstTestP() throws InterruptedException {
		
		
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(5000);
	}

}
