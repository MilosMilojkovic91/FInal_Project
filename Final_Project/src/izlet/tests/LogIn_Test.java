package izlet.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import utility.*;
import izlet.objekti.LogInKlasa;

public class LogIn_Test {

	// Method for testing opening of Log In page
	public static void openLogInURLe(WebDriver wd) {
		if (!wd.getCurrentUrl().equals(LogInKlasa.LogInURL)) {
			wd.navigate().to(LogInKlasa.LogInURL);
		}
	}

	// Method to fill in fields by user manually
	public static void userLogIn(WebDriver wd, Scanner sc) throws Exception {

		System.out.println("Enter your: ");

		// User
		System.out.println("Username");
		LogInKlasa.clickLogInUser(wd);
		LogInKlasa.sendKeysLogInUser(wd, sc.nextLine());

		// Pass
		System.out.println("Password");
		LogInKlasa.clickLogInPass(wd);
		LogInKlasa.sendKeysLogInPass(wd, sc.nextLine());

		// Submit
		LogInKlasa.clickLogInButton(wd);
		if (wd.getCurrentUrl().equals(LogInKlasa.LogInURL)) {
			System.out.println("Log in was successful.");
		} else
			System.out.println("Log in was not successful.");
	}

	// Method to fill in LogIn form using data from Excel file
	public static void fillLogInForm(WebDriver wd, int i) throws Exception {

		String data;

		// Setting and choosing specified Excel file
		ExcelUtils.setExcelFile(Constant.Path_data + Constant.File_data, Constant.SHEET_NAME_1);

		// User
		LogInKlasa.clickLogInUser(wd);
		data = ExcelUtils.getCellData(i, 2);
		LogInKlasa.sendKeysLogInUser(wd, data);

		// Pass
		LogInKlasa.clickLogInPass(wd);
		data = ExcelUtils.getCellData(i, 4);
		LogInKlasa.sendKeysLogInPass(wd, data);

		// Submit
		LogInKlasa.clickLogInButton(wd);

	}
	// Results of the logging
	public static void testLogInForm(WebDriver wd, int i) throws Exception {
		fillLogInForm(wd, i);

		ExcelUtils.setCellData(utility.Constant.SHEET_NAME_1, 0, 7); 

		if (wd.getCurrentUrl().equals(LogInKlasa.LogInURL)) {
			System.out.println("Log in was successful.");
			ExcelUtils.setCellData(Constant.SHEET_NAME_1, i, 7);
		} else {
			System.out.println("Log in was not successful.");
			ExcelUtils.setCellData(Constant.SHEET_NAME_1, i, 7);
		}
	}

	// Method to Log Out Users
	public static void LogOut(WebDriver wd) throws Exception {
		LogInKlasa.clickLogOutButton(wd);
	}

}
