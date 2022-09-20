package org.treebo.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepo.treebo.SearchActivityPage;
import ObjectRepo.treebo.StudentPageDetailPage;
import io.github.bonigarcia.wdm.WebDriverManager;


import treebo.genericUtility.BaseClass;
import treebo.genericUtility.DataType;
import treebo.genericUtility.ExcelUtility;
import treebo.genericUtility.FileUtility;
import treebo.genericUtility.IconstantPath;
import treebo.genericUtility.Java;
import treebo.genericUtility.WebDriverUtility;

public class Tc_AutomateTest extends BaseClass {
	

		@Test(groups="regression")
		public void tc_automate() throws IOException  {
			

			StudentPageDetailPage studentPageDetail = new ObjectRepo.treebo.StudentPageDetailPage(driver);
			SearchActivityPage searchStudentId = new SearchActivityPage(driver);
			
			String student_id = fileutility.getDataFromPropertyFile("student_id");
			String firstname = fileutility.getDataFromPropertyFile("firstname");
			String middlename = fileutility.getDataFromPropertyFile("middlename");
			String lastname = fileutility.getDataFromPropertyFile("lastname");

			commonpage.clickOnAccountTab();
			commonpage.clickOnStudentTab();
			commonpage.clickOnaddStudent();
			
			studentPageDetail.passStudentId(student_id);
			studentPageDetail.StudentFirstNmae(firstname);
			studentPageDetail.StudentMiddleNmae(middlename);
			studentPageDetail.StudentLastNmae(lastname);
			 ele = driver.findElement(By.name("year"));

			Select s=new Select(ele);
			s.selectByIndex(2);
			studentPageDetail.ClickOnSaveStudent();
			studentPageDetail.clickOnTransactionTab();
			searchStudentId.checkStudentId(student_id);
			searchStudentId.searchStudentId();
			
			
			
			
			
			
		



		}
	}
