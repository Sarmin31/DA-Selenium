package daScripts;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class GetAssistanceLanding {
	static String page = "Get Assistance::Landing";
	public GetAssistanceLanding(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for the Get Assistance Landing Page");
		driver.get("http://"+ seleniumTest.domain +".disasterassistance.gov/get-assistance");
		Header.run(driver,page);
		getAssistance(driver,page);
		SendEmail.run(driver);
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		getAssistance(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	
	public static void getAssistance(WebDriver driver,String page) throws InterruptedException{
		String section = "Buttons";
		String[] backgroundImage ={
				"id",
				"background-image-container",
				"Background Image"};
		
		
		String[] buttonAddressLookUp ={
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[1]/article",
				"Address Look-up Button"};
		
		
		String[] buttonFindAssistance ={
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[2]/article",
				"Find Assistance Button"};
		
		
		String[] buttonApplyOnline ={
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[3]/article",
				"Apply Online Button"};
		
		
		String[] buttonCheckStatus ={
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[4]/article",
				"Check Your Status Button"};
		
		
		String[] buttonAssistanceByCategory ={
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[5]/article",
				"Assistance by Category Button"};
		
		
		String[] buttonAssistanceByFA ={
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[6]/article",
				"Assistance by Federal Agency Button"};
		
		
		String[] buttonAppChecklist ={
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[7]/article",
				"Application Checklist Button"};
		
		
		String[] buttonForms ={
				"xpath",
				"//*[@id=\"landing-page-container\"]/a[8]/article",
				"Forms Button"};
				
		String[][] myArray = {
				backgroundImage,buttonAddressLookUp,buttonFindAssistance,buttonApplyOnline,
				buttonCheckStatus,buttonAssistanceByCategory,buttonAssistanceByFA,buttonAppChecklist,
				buttonForms};
		RunTest.runTest(myArray,driver,page, section);
		
	}
}
