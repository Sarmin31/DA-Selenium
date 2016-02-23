package daScripts;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class ChildrenFamilies {
	static String page = "Information::Children and Families";
	public ChildrenFamilies(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Children and Families");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/information/children-and-families");
		Header.run(driver, page);
		childrenFamilies(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		childrenFamilies(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void childrenFamilies(WebDriver driver, String page) throws InterruptedException{
		String section = "Children and Families";
		String[] onlineResourcesContent ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]",
				"Online Resources"};
		
		String[] dlGuidesContent ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]",
				"Downloadable Guides and Resources"};
		
		String[] videosContent ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[3]",
				"Families Videos"};
		
		
		String[][] myArray ={
				onlineResourcesContent,dlGuidesContent,videosContent};
		RunTest.runTest(myArray,driver,section,page);
	}
}
