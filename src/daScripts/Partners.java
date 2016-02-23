package daScripts;

import org.openqa.selenium.WebDriver;

public class Partners {
	static String page = "About Us::Partners";
	public Partners(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for News Feeds");
		driver.get("http://www.disasterassistance.gov/about-us/partners");
		Header.run(driver, page);
		partners(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		partners(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void partners(WebDriver driver, String page) throws InterruptedException{
		String section = "Partners";
		String[] partneringOrg ={
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-1\"]/div/div/div/ul/li[1]/div",
				"Partnering Organizations"};
		
		
		String[] addingForms ={
				"id",
				"adding-forms",
				"Adding new Forms of Assistance"};
		
		
		String[] disasterNewsletter ={
				"id",
				"news-letter-form",
				"DisasterAssistance.gov e-Newsletter"};
		
		
		String[] disasterPolicy ={
				"id",
				"affiliate-policy-text",
				"Affiliate Policy for DisasterAssistance.gov"};
		
		String[][] myArray = {
				partneringOrg,addingForms,disasterNewsletter,disasterPolicy};
		RunTest.runTest(myArray,driver,section,page);
	}
}
