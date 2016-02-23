package daScripts;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class Accessibility {
	static String page = "Help::Accessibility";
	public Accessibility(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Accessibility");
		driver.get("http://www.disasterassistance.gov/help/accessibility");
		Header.run(driver,page);
		accessibility(driver,page);
		SendEmail.run(driver);
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		accessibility(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	} 	
	
	public static void accessibility(WebDriver driver,String page) throws InterruptedException{
		String section = "Body";
		String[] accessibilityContacts ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div",
				"Accessibility Contacts"};
		
		
		String[] backgroundImage ={
				"id",
				"background-image-container",
				"Background Image"};
		
		String[][] myArray ={
				accessibilityContacts,backgroundImage};
		RunTest.runTest(myArray,driver,page,section);
	}
}
