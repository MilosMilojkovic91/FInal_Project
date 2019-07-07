package izlet.objekti;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageStrana {

		// As advised I will use final Strings for just one use of the shortcut or XPath
		//of the fields, buttons, drop-downs, url of dashboard and other features
		public static final String PAGE_URL = "http://localhost/izlet/";
		
		// This method is where you get URL from a specified page
		public static void openHomePageStrana(WebDriver a) {
			a.get(PAGE_URL);
		}
		// Through this Method you you can navigate to page's URL
		public static void navigateTo(WebDriver dr) {
			dr.navigate().to(PAGE_URL);
		}
	}


