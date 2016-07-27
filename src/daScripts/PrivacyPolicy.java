package daScripts;

import java.io.IOException;



import org.openqa.selenium.WebDriver;

public class PrivacyPolicy {
	static String page = "Help::Privacy Policy";
	public PrivacyPolicy(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException,  IOException{
		//System.out.println("Running test for Privacy Policy");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/help/privacy-policy");
		Header.run(driver,page);
		privacyPolicy(driver,page);
//		SendEmail.run(driver);
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		privacyPolicy(driver, spanishPage);
//		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/");
	}
	
	public static void privacyPolicy(WebDriver driver,String page) throws InterruptedException{
		String section = "Body";
		String[] policyHeader = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]/div/div",
				"Privacy Policy Header"};
		String[] personalII = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]/div/div",
				"Personally Identifiable Information"};
		String[] childrensPrivacy = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]/div/div",
				"Children's Privacy"};
		String[] paperworkReduction = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[3]/div/div",
				"Paperwork Reduction Act Notice"};
		String[] useCookies = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[4]/div/div",
				"How We Use Cookies"};
		String[] googleAnalytics = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[5]/div/div",
				"Google Analytics"};
		String[] addThis = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[6]/div/div",
				"AddThis"};
		String[] surveyMonkey = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[7]/div/div",
				"SurveyMonkey"};
		String[] siteMetrics = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[8]/div/div",
				"Site Metrics"};
		String[] linkedWebsites = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[9]/div/div",
				"Visiting Linked Websites"};
		String[] backgroundImage = {
				"id",
				"background-image-container",
				"Background Image"};
		
		String[][] myArray = {
				policyHeader,personalII,childrensPrivacy,paperworkReduction,useCookies,googleAnalytics,
				addThis,surveyMonkey,siteMetrics,linkedWebsites,backgroundImage};
		RunTest.runTest(myArray,driver,page,section);
	}
}