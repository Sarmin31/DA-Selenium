package daScripts;

import java.io.IOException;



import org.openqa.selenium.WebDriver;

public class OlderAmericans {
	static String page = "Information::Older Americans";
	public OlderAmericans(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException,  IOException{
		//System.out.println("Running test for Older Americans");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/information/older-americans");
		Header.run(driver, page);
		olderAmericans(driver, page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		olderAmericans(driver, spanishPage);
//		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/");
	}
	
	public static void olderAmericans(WebDriver driver, String page) throws InterruptedException{
		String section = "Older Americans";
		String[] onlineResourcesContent = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]",
				"Online Resources"};
		String[] dlGuidesContent = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]",
				"Downloadable Guides and Resources"};
		String[] videosContent = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[3]",
				"Videos"};
		
		String[][] myArray = {
				onlineResourcesContent,dlGuidesContent,videosContent};
		RunTest.runTest(myArray,driver,section,page);
	}
}
