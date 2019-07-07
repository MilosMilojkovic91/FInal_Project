package izlet.tests;


import org.openqa.selenium.WebDriver;

import izlet.objekti.Registracija;

import utility.*;
import izlet.objekti.HomePageStrana;
import izlet.objekti.LogInKlasa;

	public class HomePageTest {

		// Method to open HomePage(or if I a user is not there, just to navigate to Home page of URL
		public static void openHomePage(WebDriver wd) {
			if (!wd.getCurrentUrl().equals(HomePageStrana.PAGE_URL)) {
				wd.navigate().to(HomePageStrana.PAGE_URL);
			}
		}
		// Method to test Registration and LogIn row by row, with all data from specified excel
		// file
		public static void testWithAllData(WebDriver wd) throws Exception {

			// Set Excel file
			ExcelUtils.setExcelFile(Constant.Path_data + Constant.File_data, Constant.SHEET_NAME_1);

			for (int i = 1; i < ExcelUtils.getRowCount(utility.Constant.SHEET_NAME_1); i++) {

				RegistracijaTest.testRegForm(wd, i);

				if (wd.getCurrentUrl().equals(LogInKlasa.LogInURL)) {
					LogIn_Test.LogOut(wd);
				} else {
					wd.navigate().to(HomePageStrana.PAGE_URL);

				}
			}
		}
}



