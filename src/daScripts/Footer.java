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
		String[] footer ={
				"xpath",
				"//*[@id=\"footer\"]",
				"Footer Container"};
		String[] StayConnected ={
				"xpath",
				"//*[@id=\"block-nodeblock-14970\"]/h2",
				"Stay Connected Section"};
		String[] facebook ={
				"xpath",
				"//*[@id=\"atstbx\"]/a[1]/span",
				"Facebook Icon"};
		String[] SurveyMonkey ={
				"xpath",
				"//*[@id=\"other || other\"]/img",
				"Survey Monkey Icon"};
		
		String[] DHSGov = {
				"id",
				"U.S. Department of Homeland Security || U.S. Department of Homeland Security",
				"DHS.gov Link"};
		
		
		
		String[][] myArray ={
				footer,StayConnected,
				facebook, SurveyMonkey,DHSGov};
		//System.out.println("---Running test for the Header(Home and Get Assistance)");
		RunTest.runTest(myArray,driver,page, section);
		
	}
	
}
