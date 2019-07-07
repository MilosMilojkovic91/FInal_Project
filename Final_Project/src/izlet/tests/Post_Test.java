package izlet.tests;

import java.util.Scanner;


import org.openqa.selenium.WebDriver;

import utility.*;
import izlet.objekti.Post;

public class Post_Test {

	

		// Method to post manually
		public static void userNewPost(WebDriver wd, Scanner sc) throws Exception {

			// Make New Post Button
			Post.clickMake_Post_Button(wd);

			// Naziv
			System.out.println("Post Title:");
			Post.clickNaziv(wd);
			Post.sendKeysNaziv(wd, sc.nextLine());

			// Lokacija
			System.out.println("Location");
			Post.clickLokacija(wd);
			Post.sendKeysLokacija(wd, sc.nextLine());
			

			// DropDown
			System.out.println("Choose transport:");
			System.out.println("Walk, Car, Motorbike, Bicycle, Bus");
			Post.SendKeysDropDown(wd, sc.nextLine());
			
			// Opis
			System.out.println("Post Description");
			Post.clickOpis(wd);
			Post.sendKeysOpis(wd, sc.nextLine());

			// Submit
			Post.clickSubmit(wd);
		}

		// Method to post using data from Excel file
		public static void newPost(WebDriver wd, int i, String str) throws Exception {

			String data;
			
			//Setting Excel file
			ExcelUtils.setExcelFile(Constant.Path_data + Constant.File_data, Constant.SHEET_NAME_2);

			// New Post Button
			Post.clickMake_Post_Button(wd);

			// Naziv => Title
			Post.clickNaziv(wd);
			data = ExcelUtils.getCellData(i, 1);
			Post.sendKeysNaziv(wd, data);

			// Location
			Post.clickLokacija(wd);
			data = ExcelUtils.getCellData(i, 2);
			Post.sendKeysLokacija(wd, data);

		

			// Drop-Down => Transport
			Post.SendKeysDropDown(wd, str);
			data = ExcelUtils.getCellData(i, 2);
			Post.SendKeysDropDown(wd, data);
			
			// Opis = > Description
			Post.clickOpis(wd);
			data = ExcelUtils.getCellData(i, 0);
			Post.sendKeysOpis(wd, data);

			// Submit
			Post.clickSubmit(wd);
			if (wd.getCurrentUrl().equals(Post.URL_Dashboard)) {
				System.out.println("Successful.");
			} else
				System.out.println("Not successful.");
			}

		// Method for more posts using info from specified excel file
		public static void multiplePosts(WebDriver wd, String str) throws Exception {

			// Setting Excel file
			ExcelUtils.setExcelFile(Constant.Path_data +Constant.File_data, Constant.SHEET_NAME_2);

			// for all data from file
			// for (int i = 1; i < ExcelUtils.getRowCount(DataExcelIzlet.SHEET_NAME_2); i++){

			for (int i = 1; i < 10; i++) {
				newPost(wd, i, str);
			}
			
			if (wd.getCurrentUrl().equals(Post.URL_Dashboard)) {
				System.out.println("They are set.");
			} else
				System.out.println("They are not set.");
		}
}


