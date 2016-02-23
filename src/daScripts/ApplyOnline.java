package daScripts;

import org.openqa.selenium.WebDriver;

public class ApplyOnline {
	static String page = "Get Assistance::Apply Online";
	public ApplyOnline(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Apply Online");
		driver.get("https://www.disasterassistance.gov/DAC/govBenefitReceiver.do?gbsessionid=0&action=RI&langcode=EN");
		applyOnline(driver, page);
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void applyOnline(WebDriver driver, String page) throws InterruptedException{
		String section = "Apply Online";
		String[] leftHeader = {
				"xpath",
				"/html/body/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[1]",
				"Left Header"};
		
		String[] rightHeader = {
				"xpath",
				"/html/body/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[2]",
				"Right Header"};
		
		String[] formContainer = {
				"xpath",
				"//*[@id=\"pageContent\"]/form",
				"formContainer"};
		
		String[] inputField = {
				"xpath",
				"//*[@id=\"pageContent\"]/form/table[2]/tbody/tr[5]/td/input",
				"Captcha Input Field"};
		
		String[] buttonReset = {
				"id",
				"btnReset",
				"Reset Button"};
		
		String[] buttonSubmit = {
				"id",
				"btnSubmit",
				"Submit Button"};
		
				
		String[][] myArray = {
				leftHeader,rightHeader,formContainer,inputField,buttonReset,buttonSubmit};
		RunTest.runTest(myArray,driver,section,page);
	}
}
