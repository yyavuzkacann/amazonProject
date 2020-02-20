package testProject;
import testProject.productPage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class wishListPage extends locators{
	
	public static void verifyListLoad() {
		Assertions.assertTrue(driver.findElement(By.cssSelector(listButtonCheck)).getText().contains("Alışveriş Listesi"),"you couldn't click go to list button");
	}
	
	public static void productAddCheck(){
		Assertions.assertTrue(driver.findElement(By.cssSelector(removeProductButton)).getText().contains("Ürünü kaldır"),"Product couldn't added");
	}
	
	public static void checkProductIsSame() {
		System.out.print(productPage.getProductName());
		Assertions.assertEquals(productPage.getProductName(), driver.findElement(By.cssSelector(productNameInList)).getText());
		System.out.println("checkEttim");
	}

	public static void removeProduct() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(removeProductButton)).click();
	}
	
	public static void productRemoveCheck(){
		Assertions.assertTrue(driver.findElement(By.cssSelector(removeProductButton)).isDisplayed(),"Product still in list");
	}
	
}
