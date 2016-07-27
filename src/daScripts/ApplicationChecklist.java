package daScripts;

import org.openqa.selenium.WebDriver;

public class ApplicationChecklist {
	static String page = "Get Assistance::Application Checklist";
	public ApplicationChecklist(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Application Checklist");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/get-assistance/application-checklist");
		Header.run(driver, page);
		applicationChecklist(driver, page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		applicationChecklist(driver, spanishPage);
//		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	
	public static void applicationChecklist(WebDriver driver, String page) throws InterruptedException{
		String section = "Application Checklist";
		String[] applyOnlineInstructions = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-2\"]/div/div/div/ul/li[1]/div",
				"Apply Online for Assistance"};
		String[] informationChecklistContainer = {
				"xpath",
				"//*[@id=\"field-name-field-red-title\"]",
				"Information Checklist"};
		String[] socialSecurityNum = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-2\"]/div/div/div/ul/li[2]/div/div[3]/div/div[1]",
				"Social Security Number"};
		String[] insuranceInfo = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-2\"]/div/div/div/ul/li[2]/div/div[3]/div/div[2]",
				"Insurance Information"};
		String[] damageInfo = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-2\"]/div/div/div/ul/li[2]/div/div[3]/div/div[3]",
				"Damage Information"};
		String[] financialInfo = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-2\"]/div/div/div/ul/li[2]/div/div[3]/div/div[4]",
				"Financial Information"};
		String[] contactInfo = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-2\"]/div/div/div/ul/li[2]/div/div[3]/div/div[5]",
				"Contact Information"};
		String[] directDepositInfo = {
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-2\"]/div/div/div/ul/li[2]/div/div[3]/div/div[6]",
				"Direct Deposit Information"};
		String[][] myArray = {
				applyOnlineInstructions,informationChecklistContainer,
				socialSecurityNum,insuranceInfo,damageInfo,financialInfo,contactInfo,directDepositInfo};
		RunTest.runTest(myArray,driver,section,page);
	}
}
