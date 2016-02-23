package daScripts;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;

public class ContactUs {
	static String page = "Help::Contact Us";
	public ContactUs(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException, MessagingException, IOException{
		//System.out.println("Running test for Contact Us");
		driver.get("http://www.disasterassistance.gov/help/contact-us");
		Header.run(driver,page);
		contactUs(driver,page);
		SendEmail.run(driver);
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		contactUs(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void contactUs(WebDriver driver,String page) throws InterruptedException{
		String section = "Body";
		String[] contactHeader ={
				"xpath",
				"//*[@id=\"page-title\"]",
				"Contact Us Header"};
		
		String[] femaHelpline ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]/div/div",
				"FEMA Helpline"};
		
		String[] femaHelpDesk ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]/div/div",
				"FEMA Internet Help Desk"};
		
		
		String[] femaDisasterRecovery = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[3]/div/div",
				"FEMA Disaster Recovery Center"};
		
		
		String[] assistanceFromPartners = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[4]/div/div",
				"Assistance From Our Partners"};
		
		
		String[] daNewsletter = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[5]/div/div",
				"DisasterAssistance.gov e-Newsletter"};
		
		
		String[] mediaContacts = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[6]/div/div",
				"Media Contacts"};
		
		
		String[] disasterFraud ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[7]/div/div",
				"Disaster Fraud"};
		
		
		String[] suggestionsFeedback ={
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[8]/div/div",
				"Suggestions or Feedback"};
		
		
		String[] backgroundImage ={
				"id",
				"background-image-container",
				"Background Image"};
		
		
		String[][] myArray ={
				contactHeader,femaHelpline,femaHelpDesk,femaDisasterRecovery,assistanceFromPartners,
				daNewsletter,mediaContacts,disasterFraud,suggestionsFeedback,backgroundImage};
		RunTest.runTest(myArray,driver,page,section);
	}
}
