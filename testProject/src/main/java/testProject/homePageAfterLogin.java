package testProject;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class homePageAfterLogin extends locators{
	
	public static void verifyLogin() {
		Assertions.assertTrue(driver.findElement(By.cssSelector(nameLabel)).getText().contains("Yavuz"), "Login failed");
	}
	
	public static void writeSearchKey(String searchKey) {
		driver.findElement(By.id(searchBox)).sendKeys(searchKey);
	}
	
	public static void clickSearchButton() {
		driver.findElement(By.cssSelector(searchButton)).click();
	}
	
}
