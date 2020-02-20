package testProject;

import org.openqa.selenium.WebDriver;

public class locators {
	public static WebDriver driver = null;
	
	
	static String loginButton = "a-autoid-0-announce";
	static String mail = "input#ap_email";
	static String continueButton = "input#continue";
	static String password = "input#ap_password";
	static String submitButton = "input#signInSubmit";
	static String nameLabel = "a#nav-link-accountList > span.nav-line-1";
	static String searchBox = "twotabsearchtextbox";
	static String searchButton = "form[name=\"site-search\"] div.nav-right > div > input";
	static String searchResult = "div#search span.a-color-state.a-text-bold";
	static String secondButton = "div#search li:nth-child(3) > a";
	static String product = "div#search div:nth-child(3) > div > span > div > div > span > a > div > img";
	static String addWishList = "input#add-to-wishlist-button-submit";
	static String productAddedCheck = "div#WLHUC_info li:nth-child(2) > table > tbody > tr > td > a";
	static String goToListButton = "a#WLHUC_viewlist span > span";
	static String listButtonCheck = "span#profile-list-name";
	static String removeProductButton = "div#itemAction_I3P5RIHOJWIM06 div > span > a";
	static String productNameInProduct = "productTitle";
	static String productNameInList = "a#itemName_I3P5RIHOJWIM06";
	
}
