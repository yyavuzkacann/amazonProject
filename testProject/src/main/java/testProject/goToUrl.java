package testProject;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class goToUrl extends locators{
	
	@Test	
	public static void navigate() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yavuz.kacan\\Downloads\\testProject\\chromedriver");
		driver = new ChromeDriver();
		String url="https://www.amazon.com.tr/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public static void verifyTitle() {
		Assertions.assertTrue(driver.getTitle().contains("Amazon.com.tr"),"You're in the right page");
	}
	
	@Test
	public static void clickLoginButton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id(loginButton)).click();
	}
	
}
