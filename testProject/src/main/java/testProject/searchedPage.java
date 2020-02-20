package testProject;



import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class searchedPage extends locators{
	
	public static void searchCheck(String searchKey) {
		String actualSearchResult = driver.findElement(By.cssSelector(searchResult)).getText();
		String editedActualSearchResult = actualSearchResult.substring(1, actualSearchResult.length()-1);
		Assertions.assertEquals(editedActualSearchResult,searchKey,"You searched "+searchKey);
	}

	public static void clickSecondPageButton() {
		driver.findElement(By.cssSelector(secondButton)).click();
	}
}
