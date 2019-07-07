package izlet.tests;

import java.util.Scanner;

import utility.Constant;
import utility.ExcelUtils;

import org.openqa.selenium.WebDriver;
import izlet.objekti.EditPost;

import org.openqa.selenium.WebDriver;

public class EditPost_Test {

	//Method for testing  manual filling and choosing info
	public static void editPost(WebDriver wd, int n) {
		Scanner sc = new Scanner(System.in);
		EditPost.clickGetEditDeleteButtons(wd);
		EditPost.clickEditButton(wd);

		System.out.println("Name of this Post: ");
		String str = sc.nextLine();
		EditPost.clickName(wd);
		EditPost.sendKeysName(wd, str);

		System.out.println("Location of this Post: ");
		str = sc.nextLine();
		EditPost.clickLocation(wd);
		EditPost.sendKeysLocation(wd, str);

		System.out.println("Pick transportation of this Post: ");
		str = sc.nextLine();
		EditPost.clickDropDownEdit(wd);
		EditPost.selectDropdownEdit(wd);

		System.out.println("Description of ths Post: ");
		str = sc.nextLine();
		EditPost.getEditText(wd).clear();
		EditPost.clickEditText(wd);
		EditPost.sendKeysEditText(wd, str);

		EditPost.clickPostEditedText(wd);
	}
	
	//Method for testing automatic filling and choosing fields from my Data.xls
	public static void editPosts(WebDriver wd, int n, int k) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_data + Constant.File_data, Constant.SHEET_NAME_2);
		String str;
		EditPost.clickGetEditDeleteButtons(wd);
		EditPost.clickEditButton(wd);

		str = ExcelUtils.getCellData(k, 1);
		EditPost.clickName(wd);
		EditPost.sendKeysName(wd, str);

		str = ExcelUtils.getCellData(k, 2);
		EditPost.clickLocation(wd);
		EditPost.sendKeysLocation(wd, str);

		str = ExcelUtils.getCellData(k, 0);
		EditPost.clickEditText(wd);
		EditPost.sendKeysEditText(wd, str);

		EditPost.clickPostEditedText(wd);

	}
}
