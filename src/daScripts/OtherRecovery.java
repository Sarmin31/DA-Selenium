package daScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


public class OtherRecovery {
	static String page = "Get Assistance::Other Recovery Help";
	public OtherRecovery(){

	}
	public static void run(WebDriver driver) throws InterruptedException, IOException{
		//System.out.println("Running test for Other Recovery Help");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/get-assistance/other-recovery-help");
		Header.run(driver, page);
		otherRecoveryHelp(driver, page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		otherRecoveryHelp(driver, spanishPage);
//		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	
	public static void otherRecoveryHelp(WebDriver driver, String page) throws InterruptedException{
		String section = "Other Recover Help";
		String[] othRecoveryContainer = {
				"xpath",
				"//*[@id='content-container']/article",
				"Other Recovery Help"};
		String[] catalogFDA = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[1]",  //*[@id='Other Federal || Other Federal']",
				"Catalog of Federal Domestic Assistance"};
		String[] grantsgov = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[2]",
				"Grants.gov"};
		String[] benefitsgov = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[3]",
				"Benefits.gov"};
		String[] nationalRN = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[4]",
				"National Resource Network"};
		String[] areYouReady = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[5]",
				"Are You Ready? Guide"};
		String[] govServicesAndInfo = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[6]",
				"U.S. Government Services and Information"};
		String[] americanHometowns = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[7]",
				"American Hometowns - Cities, Counties and Towns"};
		String[] stateGov = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[8]",
				"State Governments"};
		String[] postalService = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[9]",
				"US Postal Service Alerts"};
		String[] altFuelingStation = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[10]",
				"Alternative Fueling Station Locator"};
		String[] emergencyWatershed = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[11]",
				"Emergency Watershed Protection (EWP) Program"};
		String[] communityDevelopment = {
				"xpath",
				"//*[@id='content-container']/article/div/div/div/div/div/div/div/div[2]/div/div[12]",
				"Community Development Resources"};
		String[][] myArray = {
				othRecoveryContainer,catalogFDA,grantsgov,benefitsgov,nationalRN,areYouReady,govServicesAndInfo,americanHometowns,stateGov,
				postalService,altFuelingStation,emergencyWatershed,communityDevelopment};
		RunTest.runTest(myArray,driver,section,page);
	}
	}
