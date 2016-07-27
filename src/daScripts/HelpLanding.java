package daScripts;

import java.io.IOException;



import org.openqa.selenium.WebDriver;

public class HelpLanding {
	static String page = "Help::Landing";
	public HelpLanding(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException,  IOException{
		//System.out.println("Running test for the Help Landing Page");
		driver.get("http://"+seleniumTest.domain+".disasterassistance.gov/help");
//		Header.run(driver,page);
		help(driver,page);
//		SendEmail.run(driver);
//		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
//		Header.run(driver, spanishPage);
		help(driver, spanishPage);
//		SendEmail.run(driver);
//		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	
	public static void help(WebDriver driver,String page) throws InterruptedException{
		String section = "Buttons";
		String[] backgroundImage = {
				"id",
				"background-image-container",
				"Background Image"};
		String[] buttonFAQ = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[1]/article",
				"FAQ Button"};
		String[] buttonContactUs = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[2]/article",
				"Contact Us Button"};
		String[] buttonPrivacyPolicy = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[3]/article",
				"Privacy Policy Button"};
		String[] buttonAccessibility = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[4]/article",
				"Acessibility Button"};
		String[] buttonDownloads = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[5]/article",
				"Download Plug-ins Button"};
				
		String[][] myArray = {
				backgroundImage,buttonFAQ,buttonContactUs,buttonPrivacyPolicy,buttonAccessibility,buttonDownloads};
		RunTest.runTest(myArray,driver,page, section);
		
	}
}
