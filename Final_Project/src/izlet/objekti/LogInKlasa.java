package izlet.objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInKlasa {

	// static final String for xPaths - used like this for easier maneuvering with
	// them
	public static final String LogInURL = "https://izlet.000webhostapp.com/izlet/index.php?fbclid=IwAR0DliUgwtirODBMUni_jtlSvWdEZNF85pPMNjmTElgEI3AY0yjoeA29UCM";
	private static final String LogInUser = "//input[@placeholder='username']";
	private static final String LogInPass = "//input[@placeholder='password']";
	private static final String LogInButton = "//input[@name='login']";
	private static final String LogOutButton = "//a[@id='logoutBtn']";

	// Method for LogIn URL
	public static void openLogInURL(WebDriver ab) {
		ab.get(LogInURL);
	}

	public static void navigateTo(WebDriver ab) {
		ab.navigate().to(LogInURL);
	}

	//Method for Log In Username
	public static WebElement getLogInUser(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LogInUser));
		return wb;
	}

	public static void clickLogInUser(WebDriver dr) {
		getLogInUser(dr).click();
	}

	public static void sendKeysLogInUser(WebDriver wd, String str) {
		getLogInUser(wd).sendKeys(str);
	}

	//Method for Log In password
	public static WebElement getLogInPass(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LogInPass));
		return wb;
	}

	public static void clickLogInPass(WebDriver d) {
		getLogInUser(d).click();
	}

	public static void sendKeysLogInPass(WebDriver wd, String str) {
		getLogInPass(wd).sendKeys(str);
	}

	
	//Method for Logging in
	public static WebElement getLogInButton(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LogInButton));
		return wb;
	}

	public static void clickLogInButton(WebDriver d) {
		getLogInButton(d).click();
	}

	// Method for Logging out
	public static WebElement getLogOutButton(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(LogOutButton));
		return driver;
	}

	public static void clickLogOutButton(WebDriver wd) {
		getLogOutButton(wd).click();
	}

}
