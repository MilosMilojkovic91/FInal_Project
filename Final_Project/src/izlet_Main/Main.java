package izlet_Main;

import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelUtils;

import org.openqa.selenium.*;

import izlet.objekti.*;
import izlet.tests.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		try {

			HomePageStrana.openHomePageStrana(wd);
			Thread.sleep(4000);
			
			System.out.println("Welcome to testing page izlet/index.php!");
			System.out.println("If you want to test manually and manually add your info press - m");
			System.out.println("If you want to test automaticly and the info will be added from a specified exccel file press - a");

			int o = sc.nextInt();

			switch (o) {

			case 0:
				System.out.println("You chosed manual testing of this page");
				HomePageStrana.openHomePageStrana(wd);
				RegistracijaTest.userRegister(wd,  sc);
				LogIn_Test.LogOut(wd);

				break;

			case 1:

				System.out.println("You chosed automation testing of this page");
				HomePageStrana.openHomePageStrana(wd);
				RegistracijaTest.testRegForm(wd, o);
				break;

			default:
				System.out.println("You can not choose that option!");

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			wd.quit();
			sc.close();
		}
	}

}
