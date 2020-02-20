package testProject;

import org.openqa.selenium.By;

public class loginPage extends locators {
	
	public static void writeEmail(String email) {
		driver.findElement(By.cssSelector(mail)).sendKeys(email);
	}
	
	public static void clickEmail() {
		driver.findElement(By.cssSelector(continueButton)).click();
	}
	
	public static void writePassword(String pass) {
		driver.findElement(By.cssSelector(password)).sendKeys(pass);
	}
	
	public static void clickPassword() {
		driver.findElement(By.cssSelector(submitButton)).click();
	}
}
