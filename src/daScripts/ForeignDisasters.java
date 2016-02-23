package daScripts;

import org.openqa.selenium.WebDriver;

public class ForeignDisasters {
	static String page = "Information::Foreign Disasters";
	public ForeignDisasters(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Foreign Disasters");
		driver.get("http://"+seleniumTest.domain+".disasterassistance.gov/information/foreign-disasters");
		Header.run(driver, page);
		foreignDisasters(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		foreignDisasters(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void foreignDisasters(WebDriver driver, String page) throws InterruptedException{
		String section = "Foreign Disasters";
		String[] foreignDisasterContainer ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]",
				"Foreign Disaster Information"};
		
		
		String[] foreignCrisis ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]",
				"Are You Caught in a Foreign Crisis?"};
		
		
		String[] familyAbroad ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]",
				"Are You Concerned About Family Abroad?"};
		
		
		String[] terroristAttack ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[3]",
				"Were You Affected by a Terrorist Attack Abroad?"};
		
		
		String[] disasterResponse ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[4]",
				"Do You Want to Help Support Disaster Response Abroad?"};
		
		String[][] myArray = {
				foreignDisasterContainer,foreignCrisis,familyAbroad,terroristAttack,disasterResponse};
		RunTest.runTest(myArray,driver,section,page);
	}
}
