package org.treebo.practice;

import org.testng.annotations.Test;

import treebo.genericUtility.WebDriverUtility;

public class MavenPractice1Test {
	@Test
	public void step1Test() {
		//commit
		String browser = System.getProperty("b");
		String url = System.getProperty("u");

		System.out.println("Browser name is "+browser);
		System.out.println("URL is"+url);
		

//		WebDriverUtility webdriverutility = new WebDriverUtility();
//		webdriverutility.openBrowserWithApplication(browser, 10l, url);

	}
}
