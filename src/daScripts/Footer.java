package daScripts;

import org.openqa.selenium.WebDriver;


public class Footer  {
	public static void run(WebDriver driver, String page) throws InterruptedException{
		footer(driver,page);
		
					}
	public static void footer (WebDriver driver, String page) throws InterruptedException{
		String section = "Footer";
		
		/*
		 * Enter Xpath of the header category, xpath of the sub item, and a description. 
		 */
		String[] footer = {
				"xpath",
				"//*[@id=\"footer\"]",
				"Footer Container"};
		
		
		String[] StayConnected = {
				"xpath",
				"//*[@id=\"block-nodeblock-14970\"]/h2",
				"Stay Connected Section"};
		String[] facebook = {
				"xpath",
				"//*[@id='atstbx']/a[1]/span",
//				"//*[@id='atstbx']/button[1]",
				"Facebook Icon"};
		//adding twitter, more and feedback link
		String[] twitter = {
				"xpath",
//				"//*[@id='atstbx']/button[2]",
				"//*[@id='atstbx']/a[2]/span",
				"Twitter Icon"};
		String[] more = {
				"xpath",
//				"//*[@id='atstbx']/button[3]",
				"//*[@id='atstbx']/a[3]/span",
				"More Icon"};
		String[] SurveyMonkey = {
				"xpath",
				"//*[@id=\"other || other\"]",
				"Survey Monkey Icon"};
		
		String[] DHSGov = {
				"xpath",
				"//*[@id='U.S. Department of Homeland Security || U.S. Department of Homeland Security']",
				"DHS.gov Link"};
		//adding other.gov links due to same xapth wont be recognized
//		String[] FEMAGov = {
//				"xpath",
//				"//*[@id='U.S. Department of Homeland Security || U.S. Department of Homeland Security']",
//				"FEMA.gov Link"};
//		String[] ReadyGov = {
//				"xpath",
//				"//*[@id='U.S. Department of Homeland Security || U.S. Department of Homeland Security']",
//				"Ready.gov Link"};
		String[] USAGov = {
				"xpath",
				"//*[@id='Other || Other']",
				"USA.gov Link"};
//		String[] WhiteHouseGov = {
//				"xpath",
//				"//*[@id='Other || Other']",
//				"WhiteHouse.gov Link"};
//		String[] EGov = {
//				"xpath",
//				"//*[@id='Other || Other']",
//				"E-Gov.gov Link"};
//		String[] BusinessUSAGov = {
//				"xpath",
//				"//*[@id='Other || Other']",
//				"Business.USA.gov Link"};

		
		String[][] myArray = {
				footer,StayConnected,
				facebook,twitter, more, SurveyMonkey, DHSGov, //FEMAGov, ReadyGov, 
				USAGov //, WhiteHouseGov, EGov, BusinessUSAGov
				};
		//System.out.println("---Running test for the Header(Home and Get Assistance)");
		RunTest.runTest(myArray,driver,page, section);
		

		
	}
	
}
