package daScripts;

import java.io.IOException;



import org.openqa.selenium.WebDriver;

public class InformationLanding {
	static String page = "Information::Landing";
	public InformationLanding(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException,  IOException{
		//System.out.println("Running test for the Information Landing Page");
		driver.get("http://"+seleniumTest.domain+".disasterassistance.gov/information");
//		Header.run(driver, page);
		information(driver,page);
//		SendEmail.run(driver);
//		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
//		Header.run(driver, spanishPage);
		information(driver, spanishPage);
//		SendEmail.run(driver);
//		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	
	public static void information(WebDriver driver,String page) throws InterruptedException{
		String section = "Buttons";
		String[] backgroundImage = {
				"id",
				"background-image-container",
				"Background Image"};
		String[] buttonNewsFeeds = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[1]/article",
				"News Feeds Button"};
		String[] buttonImmediateNeeds = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[2]/article",
				"Immediate Needs Button"};
		String[] buttonMovingForward = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[3]/article",
				"Moving Forward Button"};
//		String[] buttonCommunityResources = {
//				"xpath",
//				"//*[@id=\"landing-page-container\"]/a[4]/article",
//				"Community Resources Button"};
		String[] buttonDisabilities = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[4]/article",
				"Disabilities or Access and Functional Needs Button"};
		String[] buttonOlderAmericans = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[5]/article",
				"Older Americans Button"};
		String[] buttonChildrenFamilies = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[6]/article",
				"Children and Families Button"};
		String[] buttonDisasterTypes = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[7]/article",
				"Disaster Types Button"};
		String[] buttonForeignDisasters = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[8]/article",
				"Foreign Disasters Button"};
		String[] buttonFactSheets = {
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[9]/article",
				"Fact Sheets Button"};
				
		String[][] myArray = {
				backgroundImage,buttonNewsFeeds,buttonImmediateNeeds,buttonMovingForward,//buttonCommunityResources,
				buttonDisabilities,buttonOlderAmericans,buttonChildrenFamilies,buttonDisasterTypes,buttonForeignDisasters,
				buttonFactSheets};
		//System.out.println("---Running test for Information landing page");
		RunTest.runTest(myArray,driver,page, section);
		
	}
}
