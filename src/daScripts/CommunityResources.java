package daScripts;

import org.openqa.selenium.WebDriver;

public class CommunityResources {
	static String page = "Community Resources";
	public CommunityResources(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Community Resources");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/information/community-resources");
		Header.run(driver, page);
		communityResources(driver, page);
		RunTest.backgroundImage(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		page = page + "-Spanish";
		
		Header.run(driver, page);
		communityResources(driver, page);
		RunTest.backgroundImage(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/");
	}
	
	public static void communityResources(WebDriver driver, String page) throws InterruptedException{
		String section = "Community Resources";
		String[] comResourcesContainer = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[1]/div/div",
				"Community Resources Information"};
		
		String[] areYouReady = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[1]",
				"Are You Ready? Guide"};
		
		String[] govServicesAndInfo ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[2]",
				"U.S. Government Services and Information"};
		
		String[] americanHometowns={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[3]",
				"American Hometowns - Cities, Counties and Towns"};
		
		String[] stateGov={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[4]",
				"State Governments"};
		
		String[] postalService={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[5]",
				"US Postal Service Alerts"};
		
		String[] altFuelingStation={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[6]",
				"Alternative Fueling Station Locator"};
		
		String[] emergencyWatershed={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[7]",
				"Emergency Watershed Protection (EWP) Program"};
		
		String[] communityDevelopment={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div[2]/div/div[8]",
				"Community Development Resources"};
		
		
		String[][] myArray = {
				comResourcesContainer,areYouReady,govServicesAndInfo,americanHometowns,stateGov,
				postalService,altFuelingStation,emergencyWatershed,communityDevelopment};
		RunTest.runTest(myArray,driver,section,page);
	}
}
