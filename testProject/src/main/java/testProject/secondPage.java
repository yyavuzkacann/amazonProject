package testProject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class secondPage extends locators {
	
	public static void verifySecondPage(String secondPageCheckUrl) {
		Assertions.assertTrue(driver.getCurrentUrl().contains(secondPageCheckUrl),"You're in second page");
	}
	
	public static void chooseProduct() throws InterruptedException {
		driver.findElement(By.cssSelector(product)).click();
		Thread.sleep(2000);
	}

}
