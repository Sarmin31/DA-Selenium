package daScripts;

import org.openqa.selenium.WebDriver;

public class FAQ {
	static String page = "Help::FAQs";
	public FAQ(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for FAQs");
		driver.get("http://"+ seleniumTest.domain +".disasterassistance.gov/help/faqs");
		Header.run(driver, page);
		faqs(driver, page);
		RunTest.backgroundImage(driver, page);
		SendEmail.run(driver);
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + "-Spanish";
		
		Header.run(driver, spanishPage);
		faqs(driver, spanishPage);
		RunTest.backgroundImage(driver, spanishPage);
		Footer.run(driver,spanishPage);
		
		driver.get("http://"+ seleniumTest.domain +".disasterassistance.gov/help/faqs");
	}
	
	public static void faqs(WebDriver driver, String page) throws InterruptedException{
		String section = "FAQs";
		String[] faqsHeader ={
				"xpath",
				"//*[@id=\"inner-background-content-container\"]/div/article",
				"Frequently Asked Questions"};
		
		
		String[] beforeYouApply ={
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-4\"]/div/div/div/ul/li[1]/div",
				"Before You Apply"};
		
		
		String[] buttonCountryDeclared ={
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-4\"]/div/div/div/ul/li[1]/div/div[2]/div/div[2]/div/h4",
				"What if my country is not declared?"};
		
		
		String[] whenYouApply ={
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-4\"]/div/div/div/ul/li[2]/div",
				"When You Apply"};
		
		
		String[] createAccount ={
				"xpath",
				"//*[@id=\"hdi-create-account\"]/h4",
				"How do I create an account?"};
		
		
		String[] afterYouApply ={
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-4\"]/div/div/div/ul/li[3]/div",
				"After You Apply"};
		
		
		String[] disasterFraud ={
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-4\"]/div/div/div/ul/li[3]/div/div[2]/div/div[7]/div/h4",
				"How can I report disaster fraud?"};
		
		
		String[] preRegistration ={
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-4\"]/div/div/div/ul/li[4]/div",
				"Pre-Registration"};
		
		
		String[] whatIsPrereg ={
				"xpath",
				"//*[@id=\"block-views-static-view-pages-block-4\"]/div/div/div/ul/li[4]/div/div[2]/div/div[2]/div/h4",
				"What is Pre-Registration?"};
		
		
		String[][] myArray ={
				faqsHeader,beforeYouApply,buttonCountryDeclared,whenYouApply,createAccount,afterYouApply,
				disasterFraud,preRegistration,whatIsPrereg};
		RunTest.runTest(myArray,driver,section,page);
	}
}
