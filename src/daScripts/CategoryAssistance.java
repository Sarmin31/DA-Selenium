package daScripts;

import org.openqa.selenium.WebDriver;

public class CategoryAssistance {
	static String page = "Get Assistance::Assistance by Category";
	public CategoryAssistance(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Assistance by Category");
		driver.get("http://www.disasterassistance.gov/get-assistance/assistance-by-category");
		Header.run(driver, page);
		assistanceByCategory(driver, page);
		expandedCategory(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		assistanceByCategory(driver, spanishPage);
		expandedCategory(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void assistanceByCategory(WebDriver driver, String page) throws InterruptedException{
		String section = "Assistance By Category";
		String[] instructionsField = {
				"xpath",
				"//*[@id=\"content-container\"]/article",
				"Select a Category"};
		
		String[] buttonCareerDevelop = {
				"id",
				"D02",
				"Career Developement Assistance Group"};
		
		
		String[] buttonDisabilityAssist = {
				"id",
				"D04",
				"Disability Assistance Group"};
		
		String[] buttonDisasterRelief = {
				"id",
				"D05",
				"Disaster Relief Group"};
		
		String[] buttonEducationTraining = {
				"id",
				"D06",
				"Education/Training Group"};
		
		String[] buttonEnergyAssist = {
				"id",
				"D07",
				"Energy Assistance Group"};
		
		String[] buttonFoodNutrition = {
				"id",
				"D08",
				"Food/Nutrition Group"};
		
		String[] buttonGrantsScholarships = {
				"id",
				"D09",
				"Grants/Scholarships/Fellowships"};
		
		String[] buttonHousing = {
				"id",
				"D10",
				"Housing Group"};
		
		String[] buttonInsurance = {
				"id",
				"D11",
				"Insurance Group"};
		
		String[] buttonLegalCounsel = {
				"id",
				"D16",
				"Legal Counsel Group"};
		
		String[] buttonLivingAssist = {
				"id",
				"D13",
				"Living Assistance Group"};
		
		String[] buttonLoanRepay = {
				"id",
				"D12",
				"Loan/Loan Repayment Group"};
		
		String[] buttonMentalHealth = {
				"id",
				"D03",
				"Mental Health and Substance Abuse Group"};
		
		String[] buttonSocialSecurity = {
				"id",
				"D14",
				"Social Security Group"};
		
		String[] buttonVeteransAD = {
				"id",
				"D15",
				"Veterans-Active Duty Group"};
		

		String[][] myArray = {
				instructionsField,buttonCareerDevelop,buttonDisabilityAssist,buttonDisasterRelief,
				buttonEducationTraining,buttonEnergyAssist,buttonFoodNutrition,buttonGrantsScholarships,
				buttonHousing,buttonInsurance,buttonLegalCounsel,buttonLivingAssist,buttonLoanRepay,
				buttonMentalHealth,buttonSocialSecurity,buttonVeteransAD};
		
		RunTest.runTest(myArray,driver,section,page);
	}
	public static void expandedCategory(WebDriver driver, String page) throws InterruptedException{
		String section = "Expanded Category::Category";
		String[] federalRetiree = {
				"xpath",
				"//*[@id=\"results-offline\"]/li[1]/a",
				"Federal Retiree Benefits"};
		
		String[] foodForFlorida = {
				"xpath",
				"//*[@id=\"results-online\"]/li/a",
				"Food for Florida"};
		
		String[] busDisasterLoans = {
				"xpath",
				"//*[@id=\"results-online\"]/li[1]/a",
				"Business Disaster Loans"};
		
		String[] disasterLegalServices = {
				"xpath",	
				"//*[@id=\"results-offline\"]/li/a",
				"Disaster Legal Services (DLS)"};
		
		String[] healtheVet = {
				"xpath",
				"//*[@id=\"results-offline\"]/li[2]/a",
				"My HealtheVet Website"};
		
		String[][] myArray = {
				federalRetiree,foodForFlorida,busDisasterLoans,disasterLegalServices,
				healtheVet};
		
		RunTest.runTest(myArray,driver,section,page);
	}
}
