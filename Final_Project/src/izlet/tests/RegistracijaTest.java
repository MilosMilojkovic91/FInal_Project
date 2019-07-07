package izlet.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import izlet.objekti.Registracija;
import utility.*;
import izlet.objekti.LogInKlasa;

public class RegistracijaTest {

	/// Method to fill in Registration manually
	public static void userRegister(WebDriver wd, Scanner sc) throws Exception {
		System.out.println("Sign up by entering your:");
		// sc.nextLine();

		// Fill in forms for First_name, Last_name, Username, Email, Password and Submit
		System.out.println("First Name");
		Registracija.clickFirstName(wd);
		Registracija.sendKeysFirstName(wd, sc.nextLine());

		System.out.println("Last Name");
		Registracija.clickLastName(wd);
		Registracija.sendKeysLastName(wd, sc.nextLine());

		System.out.println("Username");
		Registracija.clickUsername(wd);
		Registracija.sendKeysUsername(wd, sc.nextLine());

		System.out.println("Email");
		Registracija.clickEmail(wd);
		Registracija.sendKeysEmail(wd, sc.nextLine());

		System.out.println("Password");
		Registracija.clickPassword(wd);
		Registracija.sendKeysPassword(wd, sc.nextLine());

		Registracija.clickRegisterButton(wd);
	}

	public static void testUserRegister(WebDriver wd, Scanner sc) throws Exception {
		userRegister(wd, sc);
		LogIn_Test.userLogIn(wd, sc);

		if (wd.getCurrentUrl().equals(LogInKlasa.LogInURL)) {
			System.out.println("Successful!");
		} else
			System.out.println("Not successful!");

	}

	// Method where I filled in data from Excel file
	public static void fillRegForm(WebDriver wd, int i) throws Exception {

		String data;
		ExcelUtils.setExcelFile(Constant.Path_data + Constant.File_data, Constant.SHEET_NAME_1);

		Registracija.clickFirstName(wd);
		data = ExcelUtils.getCellData(i, 0);
		Registracija.sendKeysFirstName(wd, data);

		Registracija.clickLastName(wd);
		data = ExcelUtils.getCellData(i, 1);
		Registracija.sendKeysLastName(wd, data);

		Registracija.clickUsername(wd);
		data = ExcelUtils.getCellData(i, 2);
		Registracija.sendKeysUsername(wd, data);

		Registracija.clickEmail(wd);
		data = ExcelUtils.getCellData(i, 3);
		Registracija.sendKeysEmail(wd, data);

		Registracija.clickPassword(wd);
		data = ExcelUtils.getCellData(i, 4);
		Registracija.sendKeysPassword(wd, data);

		Registracija.clickRegisterButton(wd);

	}

	// Method to test Registration form rows using specified excel file
	public static void testRegForm(WebDriver wd, int i) throws Exception {

		fillRegForm(wd, i);
		LogIn_Test.testLogInForm(wd, i);

		ExcelUtils.setCellData(Constant.SHEET_NAME_1, 0, 6);

		if (wd.getCurrentUrl().equals(LogInKlasa.LogInURL)) {
			System.out.println("Successful!");

			ExcelUtils.setCellData(Constant.SHEET_NAME_1, i, 6);
		} else {
			System.out.println("Not successful!");

			ExcelUtils.setCellData(Constant.SHEET_NAME_1, i, 6);
		}

	}
}
