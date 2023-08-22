package AmeenAuto.AutomationBasicAmeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementNavigateExample extends BaseDriver {
	
	String url = "https://www.daraz.com.bd/?_mkt_tracker=g&_mkt_campaign=11322136206&_mkt_adgroup=113762568369&_mkt_creative=621278777734&_mkt_src=gg&isdl=y&aff_short_key=_7agwc&gclid=Cj0KCQjwrfymBhCTARIsADXTabkfKNUp2Gf5RdF9TQ1UcKDy1L64yzjAxKmOMBOMvmdJDpgy4eBJyJUaAlrIEALw_wcB#hp-collections";
	@Test
	public void NavigateStart() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement signup= driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		signup.click();
		Thread.sleep(300);
		
		driver.navigate().back();
		Thread.sleep(300);
		
		driver.navigate().forward();
		Thread.sleep(300);
		
		driver.navigate().refresh();
		Thread.sleep(300);
				
	}

}
