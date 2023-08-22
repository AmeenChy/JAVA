package AmeenAuto.AutomationBasicAmeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommandExample extends BaseDriver {

	String url = "https://demoqa.com/automation-practice-form";

	@Test
	public void WebElementCommandStart() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(50);

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Ameen");
		Thread.sleep(500);

		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Chowdhury");
		Thread.sleep(500);

		WebElement CorrfirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		CorrfirstName.clear();
		CorrfirstName.sendKeys("Aminul Islam");
		Thread.sleep(500);

		/*
		 * WebElement DOB =
		 * driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")); DOB.click();
		 * Thread.sleep(500);
		 */

		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		System.out.println(email.getAttribute("placeholder"));
		System.out.println(email.getAttribute("autocomplete"));
		System.out.println(email.getAttribute("class"));
		System.out.println(email.getAttribute("pattern"));
		Thread.sleep(500);

		WebElement text = driver.findElement(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
		System.out.println(text.getText());
		Thread.sleep(500);

		WebElement text1 = driver.findElement(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
		String formValue = text1.getText();
		System.out.println(formValue);
		Thread.sleep(500);

		if (email.isDisplayed()) {

			email.sendKeys("chyameen@gmail.com");
			Thread.sleep(300);
		} else {
			System.out.println("This is not locatable");
		}

		WebElement male = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		if (!male.isSelected()) {
			male.click();
			Thread.sleep(3000);
		} else {
			System.out.println("This is not Selectable");
		}

		WebElement sports = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		if (!sports.isSelected()) {
			sports.click();
			Thread.sleep(3000);
		} else {
			System.out.println("This is not Selectable");
		}

		WebElement phoneNo = driver.findElement(By.id("userNumber"));
		phoneNo.sendKeys("01743077360");
		Thread.sleep(500);

		/*
		 * WebElement selectState =
		 * driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
		 * selectState.click(); Thread.sleep(500);
		 */

	//	if (selectState.isEnabled()) {

			
	/*
	 * WebElement StateClick =
	 * driver.findElement(By.xpath("//div[contains(text(),'Uttar Pradesh')]"));
	 * StateClick.click(); Thread.sleep(500);
	 */
			

			/*
			 * WebElement stateClick =
			 * driver.findElement(By.className("css-1uccc91-singleValue"));
			 * stateClick.click(); Thread.sleep(500);
			 * 
			 * 
			 * WebElement cityClick = driver.findElement(By.className("css-19bqh2r"));
			 * cityClick.click(); Thread.sleep(500);
			 * 
			 * 
			 * WebElement cityfind =
			 * driver.findElement(By.className(" css-1uccc91-singleValue"));
			 * cityfind.click(); Thread.sleep(5000);
			 */
		
		System.out.println("Text font  "  +text.getCssValue("font-size"));
		System.out.print("Color font  "  +text.getCssValue("color"));
	}

}
