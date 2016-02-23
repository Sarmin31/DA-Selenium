package daScripts;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class DisasterTypes {
	static String page = "Information::Disaster Types";
	public DisasterTypes(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Disaster Types");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/information/disaster-types");
		Header.run(driver, page);
		disasterTypes(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		disasterTypes(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void disasterTypes(WebDriver driver, String page) throws InterruptedException{
		String section = "Disaster Types";
		String[] disastersContainer = {
				"xpath",
				"//*[@id=\"content-container\"]",
				"Disasters Type Header"};
		
		
		String[] biologicalThreat = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]",
				"Biological Threat"};
		
		
		String[] chemicalThreat ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]",
				"Chemical Threat"};
		
		
		String[] drought ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[3]",
				"Drought"};
		
		
		String[] earthquake ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[4]",
				"Earthquake"};
		
		
		String[] fire ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[5]",
				"Fire"};
		
		
		String[] flood ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[6]",
				"Flood"};
		
		
		String[] heat ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[7]",
				"Heat"};
		
		
		String[] hurricane ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[8]",
				"Hurricane"};
		
		
		String[] landslide ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[9]",
				"Landslide"};
		
		
		String[] radiationNuclear ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[10]",
				"Radiation and Nuclear"};
		
		
		String[] tornado ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[11]",
				"Tornado"};
		
		
		String[] tsunami ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[12]",
				"Tsunami"};
		
		
		String[] volcano ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[13]",
				"Volcano"};
		
		
		String[] wildfire ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[14]",
				"Wildfire"};
		
		
		String[] winterStorm ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[15]",
				"Winter Storm"};
		
		
		String[][] myArray ={
				disastersContainer,biologicalThreat,chemicalThreat,drought,earthquake,fire,flood,
				heat,hurricane,landslide,radiationNuclear,tornado,tsunami,volcano,wildfire,winterStorm};
		RunTest.runTest(myArray,driver,section,page);
	}
}
