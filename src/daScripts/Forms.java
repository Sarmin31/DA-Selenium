package daScripts;

import org.openqa.selenium.WebDriver;

public class Forms {
	static String page = "Get Assistance::Forms";
	public Forms(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Forms");
		driver.get("http://"+ seleniumTest.domain+".disasterassistance.gov/get-assistance/forms");
		Header.run(driver, page);
		assistanceForms(driver, page);
		RunTest.backgroundImage(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + "-Spanish";
		
		Header.run(driver,  spanishPage);
		assistanceForms(driver,spanishPage);
		RunTest.backgroundImage(driver, spanishPage);
		Footer.run(driver, spanishPage);
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void assistanceForms(WebDriver driver, String page) throws InterruptedException{
		String section = "Forms";
		String[] instructionsField ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div/div/div[1]",
				"Form Instruction Field"};
		
		
		String[] buttonApplyOnline ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div/div/div[2]",
				"Apply Online Button"};
		
		
		String[] buttonDownloadPDF ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div/div/div/div/div/div/div[3]",
				"Download Form Button"};
		
		
		String[][] myArray ={
				instructionsField,buttonApplyOnline,buttonDownloadPDF};
		RunTest.runTest(myArray,driver,section,page);
		
	}
}
