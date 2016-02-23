package daScripts;

import org.openqa.selenium.WebDriver;

public class Overview {
	static String page = "About Us::Overview";
	public Overview(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for News Feeds");
		driver.get("http://www.disasterassistance.gov/about-us/overview");
		Header.run(driver, page);
		overview(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		overview(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void overview(WebDriver driver, String page) throws InterruptedException{
		String section = "Overview";
		String[] missionContent ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]/div/div",
				"Mission"};
		
		
		String[] backgroundContent ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]/div/div",
				"Background"};
		
		
		String[] eGovernmentContent ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[4]/div/div",
				"E-Government"};
		
		String[][] myArray = {
				missionContent,backgroundContent,eGovernmentContent};
		RunTest.runTest(myArray,driver,section,page);
	}
}
