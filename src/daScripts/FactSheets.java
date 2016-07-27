package daScripts;

import org.openqa.selenium.WebDriver;

public class FactSheets {
	static String page = "Information::Fact Sheets";
	public FactSheets(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Fact Sheets");
		driver.get("http://" + seleniumTest.domain + ".disasterassistance.gov/information/fact-sheets");
		Header.run(driver, page);
		factSheets(driver, page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		factSheets(driver, spanishPage);
//		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	
	public static void factSheets(WebDriver driver, String page) throws InterruptedException{
		String section = "Fact Sheets";
		String[] factSheetsContainer = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[1]/div/div",
				"Fact Sheets Information"};
		String[] disasterAssistance = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[1]",
				"Disaster Assistance Fact Sheet"};
		String[] survivorAppChecklist = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[2]",
				"Disaster Survivor Application Checklist "};
		String[] youthMaterials = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[3]",
				"Youth Materials"};
		
		String[][] myArray = {
				factSheetsContainer,disasterAssistance,survivorAppChecklist,youthMaterials};
		RunTest.runTest(myArray,driver,section,page);
	}
}
