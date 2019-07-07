package izlet.objekti;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Post {
	
	// static final String for xPaths - used like this for easier maneuvering with them
	public static final String URL_Dashboard= "http://localhost/izlet/dashboard.php#";
	private static final String Make_Post_Button ="//a[contains(text(),'Make a post')]";
	private static final String Naziv ="//input[@placeholder='Naziv']";
	private static final String Lokacija = "//input[@placeholder='Lokacija']";
	//DropDown menu - Transportation
	private static final String DropDown = "//div[@class='popupPost']//select[@name='transport']";
	private static final String Opis = "//textarea[@placeholder='Opis']";
	private static final String Submit = "//div[@class='popupPost']//input[@name='postSubmit']";
	
	//Method for getting URL of Post menu
	public static void openURL_Dashboard(WebDriver ab) {
		ab.get(URL_Dashboard);
	}
	
	public static void navigateTo(WebDriver ab) {
		ab.navigate().to(URL_Dashboard);
	}
	
	//Method for Post button
	public static WebElement getMake_Post_Button(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(Make_Post_Button));
		return wb;
	}
	
	public static void clickMake_Post_Button(WebDriver ab) {
		getMake_Post_Button(ab).click();
	}
	
	
	//Method for Title field
	public static WebElement getNaziv(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(Naziv));
		return wb;
	}

	public static void clickNaziv(WebDriver ab) {
		getNaziv(ab).click();
	}

	public static void sendKeysNaziv(WebDriver b, String s) {
		getNaziv(b).sendKeys(s);
	}
	
	//Method for Location field
	public static WebElement getLokacija(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(Lokacija));
		return wb;
	}

	public static void clickLokacija(WebDriver ab) {
		getLokacija(ab).click();
	}

	public static void sendKeysLokacija(WebDriver b, String s) {
		getLokacija(b).sendKeys(s);
	}
	
	//Method for transportation (in Drop-Down)
	public static WebElement getDropDown(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(DropDown));
		return wb;
	}
	
	public static void clickDropDown(WebDriver ab) {
		getDropDown(ab).click();
	}
	
	public static void SendKeysDropDown(WebDriver driver, String str) {
		getDropDown(driver).sendKeys(str);
	}
	
	// I wanted to use select and selectByVisibleText, but finally I transfered to SendKeys option
	// Select is the other option 
	//public static void selectDropDown(WebDriver ab) {
	//Select  select = new Select(getDropDown(ab));
	//select.selectByVisibleText(DropDown);
	//}
	
	
	//Method for Description (Opis) 
	public static WebElement getOpis(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(Opis));
		return wb;
	}

	public static void clickOpis(WebDriver ab) {
		getLokacija(ab).click();
	}

	public static void sendKeysOpis(WebDriver b, String s) {
		getLokacija(b).sendKeys(s);
	}
	
	
	//Method for Submit button
	public static WebElement getSubmit(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(Submit));
		return wb;
	}

	public static void clickSubmit(WebDriver ab) {
		getLokacija(ab).click();
	}



	

	
		
		
	
	
	
	

}
