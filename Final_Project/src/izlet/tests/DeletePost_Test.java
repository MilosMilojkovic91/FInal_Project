package izlet.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import izlet.objekti.DeletePost;

public class DeletePost_Test {

	// Method where I tested deleting posts
	public static void deletePost(WebDriver wd, int n) {
		DeletePost.clickGetEditDeleteButtons(wd);
		DeletePost.clickDeletePost(wd);
	}

	public static void deletePosts(WebDriver wd, int k) {
		for (int n = 0, i = 0; i < k; i++) {
			deletePost(wd, n);

		}

	}
}
