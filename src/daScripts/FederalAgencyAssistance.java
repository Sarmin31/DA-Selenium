package daScripts;

import org.openqa.selenium.WebDriver;

public class FederalAgencyAssistance {
	static String page = "Get Assistance::Assistance by Federal Agency";
	public FederalAgencyAssistance(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Assistance by Federal Agency");
		driver.get("http://"+ seleniumTest.domain+".disasterassistance.gov/get-assistance/assistance-by-federal-agency");
		Header.run(driver, page);
		assistanceByFA(driver, page);
//		expandedCategory(driver, page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		assistanceByFA(driver, spanishPage);
//		expandedCategory(driver, spanishPage);
//		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	
	public static void assistanceByFA(WebDriver driver, String page) throws InterruptedException{
		String section = "Assistance By Federal Agency";
		String[] instructionsField = {
				"xpath",
				"//*[@id=\"content-container\"]/article",
				"Select a Federal Agency"};
		String[] buttonUSDA = {
				"id",
				"2",
				"US Department of Agriculture"};
		String[] buttonED = {
				"id",
				"3",
				"US Department of Education"};
		String[] buttonHHS = {
				"id",
				"6",
				"US Department of Health and Human Services"};
		String[] buttonDHS = {
				"id",
				"805",
				"US Department of Homeland Security"};
		String[] buttonHUD = {
				"id",
				"7",
				"US Department of Housing and Urban Development"};
		String[] buttonDOJ = {
				"id",
				"901",
				"US Departmen of Justice"};
		String[] buttonDOL = {
				"id",
				"1",
				"US Department of Labor"};
		String[] buttonDOI = {
				"id",
				"72",
				"US Department of the Interior"};
		String[] buttonTreasury = {
				"id",
				"67",
				"US Department of the Treasury"};
		String[] buttonVA = {
				"id",
				"11",
				"US Department of Verterans Affairs"};
		String[] buttonOPM = {
				"id",
				"902",
				"US Office of Personnel Management"};
		String[] buttonUSPS = {
				"id",
				"913",
				"US Postal Service"};
		String[] buttonSBA = {
				"id",
				"468",
				"US Small Business Administration"};
		String[] buttonSSA = {
				"id",
				"9",
				"US Social Security Administration"};

		String[][] myArray = {
				instructionsField,buttonUSDA,buttonED,buttonHHS,buttonDHS,buttonHUD,buttonDOJ,buttonDOL,
				buttonDOI,buttonTreasury,buttonVA,buttonOPM,buttonUSPS,buttonSBA,buttonSSA};
		RunTest.runTest(myArray,driver,section,page);
	}
//	public static void expandedCategory(WebDriver driver, String page) throws InterruptedException{
//		String section = "Expanded Category::Federal Agency";
//		String[] fedStudentAidLoan = {
//				"xpath",
//				"//*[@id=\"results-online\"]/li/a",
//				"Federal Student Aid Loan and Grant Data"};
//		String[] stateCrimeVic = {
//				"xpath",
//				"//*[@id=\"results-offline\"]/li[3]/a",
//				"State Crime Victims Compensation"};
//		String[] umemployInsurance = {
//				"xpath",
//				"//*[@id=\"results-offline\"]/li[3]/a",
//				"Unemployment Insurance"};
//		String[] federalRetiree = {
//				"xpath",
//				"//*[@id=\"results-offline\"]/li/a",
//				"Federal Retiree Benefits"};
//		String[] socialSecurityMedicare = {
//				"xpath",
//				"//*[@id=\"results-offline\"]/li[8]/a",
//				"Social Security Medicare Program"};
//		
//		String[][] myArray = {
//				fedStudentAidLoan,stateCrimeVic,umemployInsurance,federalRetiree,
//				socialSecurityMedicare};
//		RunTest.runTest(myArray,driver,section,page);
//	}
}
