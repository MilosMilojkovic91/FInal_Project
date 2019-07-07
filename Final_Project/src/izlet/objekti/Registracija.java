package izlet.objekti;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registracija {

	// static final String for xPaths - used like this for easier maneuvering with them
	private static final String URL = "http://localhost/izlet/index.php";
	private static final String First_name = "//input[@name='firstname']";
	private static final String Last_name = "//input[@name='lastname']";
	private static final String Username = "//div[@class='register_form']//input[@name='username']";
	private static final String Email = "//input[@name='email']";
	private static final String Password = "//div[@class='register_form']//input[@name='password']";
	private static final String Register = "//input[@id='blue_btn']";

	// FirstName field
	public static WebElement getFirstName(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(First_name));
		return driver;
	}

	
	public static void clickFirstName(WebDriver wd) {
		getFirstName(wd).click();
	}

	
	public static void sendKeysFirstName(WebDriver wd, String str) {
		getFirstName(wd).sendKeys(str);
	}

	// Last name field
	public static WebElement getLastName(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(Last_name));
		return driver;
	}

	
	public static void clickLastName(WebDriver wd) {
		getLastName(wd).click();
	}

	public static void sendKeysLastName(WebDriver wd, String str) {
		getLastName(wd).sendKeys(str);
	}

	// User
	public static WebElement getUsername(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(Username));
		return wb;
	}

	public static void clickUsername(WebDriver dr) {
		getUsername(dr).click();
	}

	public static void sendKeysUsername(WebDriver dr, String str) {
		getUsername(dr).sendKeys(str);
	}

	// Email
	public static WebElement getEmail(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(Email));
		return wb;
	}

	public static void clickEmail(WebDriver dr) {
		getEmail(dr).click();
	}

	public static void sendKeysEmail(WebDriver dr, String s) {
		getEmail(dr).sendKeys(s);
	}
	
	// Password field
	public static WebElement getPassword(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(Password));
		return driver;
	}

	
	public static void clickPassword(WebDriver wd) {
		getPassword(wd).click();
	}

	public static void sendKeysPassword(WebDriver wd, String str) {
		getPassword(wd).sendKeys(str);
	}
	
	// RegButton
	public static WebElement getRegisterButton(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(Register));
		return driver;
	}

	
	public static void clickRegisterButton(WebDriver wd) {
		getRegisterButton(wd).click();
	}

	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(URL);
	}
}
