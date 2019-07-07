package izlet.objekti;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DeletePost {
	
	//// static final String for xPaths - used like this for easier maneuvering with them
	private static final String URL_Dashboard= "http://localhost/izlet/dashboard.php#";
	private static final String GetEditDeleteButtons = "//i[@class='fas fa-ellipsis-v']";
	private static final String DeletePost = "//i[@class='fas fa-trash-alt']";
	
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
	
	//Method for Deleting Post
	public static WebElement getDeletePost(WebDriver ab) {
		WebElement wb = ab.findElement(By.xpath(DeletePost));
		return wb;
	}
	
	public static void clickDeletePost(WebDriver ab) {
		getDeletePost(ab).click();
	}
	
}

