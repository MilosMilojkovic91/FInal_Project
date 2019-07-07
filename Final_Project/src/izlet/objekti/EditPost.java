package izlet.objekti;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditPost {
	
	// static final String for xPaths - used like this for easier maneuvering with them
	private static final String URL_Dashboard= "http://localhost/izlet/dashboard.php#";
	private static final String GetEditDeleteButtons = "//i[@class='fas fa-ellipsis-v']";
	private static final String EditButton = "//i[@class='fas fa-edit']";
	private static final String Name = "//input[@id='title']";
	private static final String Location = "//input[@id='location']";
	private static final String DropDownEdit = "//select[@id='transport']";
	private static final String EditText = "//textarea[@placeholder='Opis']";
	private static final String PostEditedText = "//div[@class='popupEdit']//input[@name='postSubmit']";
	
	//Method for entering the Post page
	public static void openPostPage(WebDriver ab) {
		ab.get(URL_Dashboard);
	}
	
	//Method for navigating to Post page
	public static void navigateTo(WebDriver ab) {
		ab.navigate().to(URL_Dashboard);
	}
	
	//Method for entering Edit and Delete options(It is Unique for Edit and Delete) 
	public static WebElement getGetEditDeleteButtons(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(GetEditDeleteButtons));
		return wb;
	}
	
	public static void clickGetEditDeleteButtons(WebDriver ab) {
		getGetEditDeleteButtons(ab).click();
	}
	
	//Method for Edit Posts option
	public static WebElement getEditButton(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(EditButton));
		return wb;
	}
	
	
	public static void clickEditButton(WebDriver ab) {
		getEditButton(ab).click();
	}
	
	//Method for Name field
	public static WebElement getName(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(Name));
		return wb;
	}
	
	public static void clickName(WebDriver ab) {
		getName(ab).click();
	}
	
	public static void sendKeysName(WebDriver b, String s) {
		getName(b).sendKeys(s);
	}
	
	//Method for Location field
	public static WebElement getLocation(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(Location));
		return wb;
	}
	
	public static void clickLocation(WebDriver ab) {
		getLocation(ab).click();
	}
	
	public static void sendKeysLocation(WebDriver b, String s) {
		getLocation(b).sendKeys(s);
	}
	
	//Method for choosing Transportation - as i called it "DropDown" 
	public static WebElement getDropDownEdit(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(DropDownEdit));
		return wb;
	}
	
	public static void clickDropDownEdit(WebDriver ab) {
		getDropDownEdit(ab).click();
	}
	
	
	public static void selectDropdownEdit(WebDriver ab) {
	Select  select = new Select(getDropDownEdit(ab));
	select.selectByVisibleText(DropDownEdit);
	}
	
	//Method for entering Description - as I called it "EditText"
	public static WebElement getEditText(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(EditText));
		return wb;
	}
	
	public static void clickEditText(WebDriver ab) {
		getEditText(ab).click();
	}
	
	public static void sendKeysEditText(WebDriver b, String s) {
		getEditText(b).sendKeys(s);
	}
	
	public static WebElement getPostEditedText(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(PostEditedText));
		return wb;
	}
	
	public static void clickPostEditedText(WebDriver ab) {
		getPostEditedText(ab).click();
	}
	
}


