package daScripts;

import org.openqa.selenium.WebDriver;

public class CheckStatus {
	static String page = "Get Assistance::Check Your Status";
	public CheckStatus(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Check Your Status");
		driver.get("https://www.disasterassistance.gov/DAC/govBenefitReceiver.do?action=LOGIN&langcode=EN");
		checkStatus(driver, page);
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void checkStatus(WebDriver driver, String page) throws InterruptedException{
		String section = "Check Your Status";
		String[] leftHeader = {
				"xpath",
				"/html/body/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[1]",
				"Left Header"};
		String[] buttonHome = {
				"xpath",
				"//*[@id=\"MM_Home\"]/div",
				"Disaster Assistance Home"};
		String[] rightHeader = {
				"xpath",
				"/html/body/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[2]",
				"Right Header"};
		String[] buttonContactUs = {
				"xpath",
				"//*[@id=\"linkbar\"]/a",
				"Contact Us Button"};
		String[] formContainer = {
				"xpath",
				"//*[@id=\"pageContent\"]/form",
				"formContainer"};
		String[] inputUsername = {
				"id",
				"uid",
				"Username Input"};
		String[] inputPassword = {
				"id",
				"pwd",
				"Password Input"};
		String[] inputPin = {
				"id",
				"pin",
				"Pin Input"};
		String[] buttonForgotUser = {
				"xpath",
				"//*[@id=\"pageContent\"]/form/table[2]/tbody/tr[4]/td[2]/a",
				"Forgot Username Button"};
		String[] buttonForgotPass = {
				"xpath",
				"//*[@id=\"pageContent\"]/form/table[2]/tbody/tr[5]/td[2]/a",
				"Forgot Password Button"};
		String[] buttonCancel = {
				"id",
				"cancel",
				"Cancel Button"};
		String[] buttonSignIn = {
				"id",
				"next",
				"Sign In Button"};
		String[] buttonCreateAcc = {
				"xpath",
				"//*[@id=\"pageContent\"]/form/table[3]/tbody/tr[2]/td/div/button",
				"Create Account Button"};
		String[][] myArray = {
				leftHeader,buttonHome,rightHeader,buttonContactUs,formContainer,inputUsername,
				inputPassword,inputPin,buttonForgotUser,buttonForgotPass,buttonCancel,
				buttonSignIn,buttonCreateAcc};
		RunTest.runTest(myArray,driver,section,page);
	}
}
