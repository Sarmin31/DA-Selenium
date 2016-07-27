package daScripts;

import org.openqa.selenium.WebDriver;

public class MovingForward {
	static String page = "Information::Moving Foward";
	public MovingForward(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/information/moving-forward");
		Header.run(driver, page);
		movingForward(driver, page);
		RunTest.backgroundImage(driver, page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + "-Spanish";
		
		Header.run(driver, spanishPage);
		movingForward(driver, spanishPage);
		RunTest.backgroundImage(driver, spanishPage);
//		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	
	public static void movingForward(WebDriver driver, String page) throws InterruptedException{
		String section = "Moving Foward";
		String[] moveFowardIntro = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div[1]/div/div",
				"Moving Foward Information"};
		String[] yourHome = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]",
				"Your Home Info"};
		String[] yourBusiness = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]",
				"Your Business or Farm"};
		String[] yourFinances = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[3]",
				"Your finances job and insurance"};
		String[] yourHealth = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[4]",
				"Your Health"};
		String[] yourOfficialDocuments = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[5]",
				"Your Official Documents"};
		
		String[][] myArray = {
				moveFowardIntro,yourHome,yourBusiness,yourFinances,yourHealth,yourOfficialDocuments
				};
		RunTest.runTest(myArray,driver,section,page);
	}
}
