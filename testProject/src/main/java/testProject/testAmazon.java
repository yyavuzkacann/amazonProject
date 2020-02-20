package testProject;
import testProject.goToUrl;
import testProject.loginPage;
import testProject.homePageAfterLogin;
import testProject.searchedPage;
import testProject.secondPage;
import testProject.productPage;
import testProject.wishListPage;
public class testAmazon {
	public static void main(String[] args) throws InterruptedException{
		
		goToUrl.navigate();
		goToUrl.verifyTitle();
		goToUrl.clickLoginButton();
		
		//Please enter your amazon username
		loginPage.writeEmail("YOUR USERNAME");
		loginPage.clickEmail();
		//Please enter your amazon password
		loginPage.writePassword("YOUR PASSWORD");
		loginPage.clickPassword();
		
		homePageAfterLogin.verifyLogin();
		homePageAfterLogin.writeSearchKey("samsung");
		homePageAfterLogin.clickSearchButton();
		
		searchedPage.searchCheck("samsung");
		searchedPage.clickSecondPageButton();
		
		secondPage.verifySecondPage("sr_pg_2");
		secondPage.chooseProduct();
		
		productPage.addProductToWishList();
		productPage.clickGoToWishList();
		
		wishListPage.verifyListLoad();
		wishListPage.productAddCheck();
		wishListPage.checkProductIsSame();
		wishListPage.removeProduct();
		wishListPage.productRemoveCheck();
	}
	
}
