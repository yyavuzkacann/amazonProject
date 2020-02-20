package testProject;

import org.openqa.selenium.By;

public class productPage extends locators{
	public static void addProductToWishList() throws InterruptedException {
		driver.findElement(By.cssSelector(addWishList)).click();
		Thread.sleep(2000);
	}
	
	public static void clickGoToWishList() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(goToListButton)).click();
		Thread.sleep(2000);
	}
	
	public static String getProductName() {
		String productName = driver.findElement(By.id(productNameInProduct)).getText();
		return productName;
	}
	
}
